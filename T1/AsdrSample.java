import java.io.*;

public class AsdrSample {

  private static final int BASE_TOKEN_NUM = 301;
  
  public static final int IDENT  = 301;
  public static final int NUM 	 = 302;
  public static final int WHILE  = 303;
  public static final int IF	 = 304;
  public static final int FI	 = 305;
  public static final int ELSE = 306;
  public static final int BOOLEAN = 307;
  public static final int INT = 308;
  public static final int DOUBLE = 309;
  public static final int TRUE = 310;
  public static final int FALSE = 311;
  public static final int FUNC = 312;
  public static final int VOID = 313;

    public static final String tokenList[] = 
      {"IDENT",
		 "NUM", 
		 "WHILE", 
		 "IF", 
		 "FI",
		 "ELSE",
       "BOOLEAN",
       "TRUE",
       "FALSE",
       "INT",
       "DOUBLE",
       "FUNC", };
       //todos os tokens devem estar mapeados no lex
                                      
  /* referencia ao objeto Scanner gerado pelo JFLEX */
  private Yylex lexer;

  public ParserVal yylval;

  private static int laToken;
  private boolean debug;

  
  /* construtor da classe */
  public AsdrSample (Reader r) {
      lexer = new Yylex (r, this);
  }

  private void Prog() {
      if (debug) System.out.println("Prog --> ListaDecl");
      ListaDecl();
   }

  private void ListaDecl() {
      if (laToken == FUNC) {
         if (debug) System.out.println("ListaDecl -->  DeclFun  ListaDecl\n");
         DeclFun();
         ListaDecl();
      } else if ( (laToken == BOOLEAN) || (laToken == INT) || (laToken == DOUBLE) ) { // se for decl de var
         if (debug) System.out.println("ListaDecl -->  DeclVar  ListaDecl\n");
         DeclVar();
         ListaDecl();
      } else {
         // vazio
         if (debug) System.out.println("ListaDecl --> Vazio");
      }
  }

  private void DeclFun() {
      if (laToken == FUNC) {
         if (debug) System.out.println("DeclFun --> FUNC tipoOuVoid IDENT '(' FormalPar ')' '{' DeclVar ListaCmd '}'\n");
         verifica(FUNC);
         TipoOuVoid();
         verifica(IDENT);
         verifica('(');
         FormalPar();
         verifica(')');
         verifica('{');
         DeclVar();
         ListaCmd();
         verifica('}');
      } else {
         // vazio
         if (debug) System.out.println("DeclFunc -> Vazio");
      }
  }

  private void DeclVar() {
      if ( (laToken == BOOLEAN) || (laToken == INT) || (laToken == DOUBLE) ) { // se for decl de var
         if (debug) System.out.println("DeclVar --> Tipo ListaIdent ';'\n");
         Tipo();
         ListaIdent();
         verifica(';');
      } else {
         // vazio 
         if (debug) System.out.println("DeclVar -> Vazio");
      }
  }

  private void ListaIdent() {
      if (debug) System.out.println("ListaIdent --> IDENT RestoListaIdent\n");
      verifica(IDENT);
      RestoListaIdent();
  }

  private void RestoListaIdent() {
   if (laToken == ',') {
      if (debug) System.out.println("RestoListaIdent —> , ListaIdent \n");
      verifica(',');
      ListaIdent();
   } else {
      // vazio
      if (debug) System.out.println("RestoListaIdent -> Vazio");
   }
}

  private void TipoOuVoid() {
      if (laToken == VOID) {
         if (debug) System.out.println("TipoOuVoid —> Void\n");
         verifica(VOID);
      } else {
         Tipo();
      }
  }
  
  private void Tipo() {
      if(laToken == INT) {
         if (debug) System.out.println("Tipo -> int");
         verifica(INT);
      } else if(laToken == BOOLEAN) {
         if (debug) System.out.println("Tipo -> boolean");
         verifica(BOOLEAN);
      } else if (laToken == DOUBLE) {
         if (debug) System.out.println("Tipo -> double");
         verifica(DOUBLE);
      } else {
         yyerror("Esperado INT, BOOLEAN ou DOUBLE");
      }
   }

  private void FormalPar() {
      if ( (laToken == BOOLEAN) || (laToken == INT) || (laToken == DOUBLE) ) {
         if (debug) System.out.println("FormalPar -> paramList\n");
         ParamList();
      } else {
         // vazio
         if (debug) System.out.println("FormalPar -> Vazio");
      }
  }

  private void ParamList() {
      if (debug) System.out.println("ParamList --> Tipo IDENT RestoParamList\r\n");
      Tipo();
      verifica(IDENT);
      RestoParamList();
  }

  private void RestoParamList() {
      if (laToken == ',') {
         if (debug) System.out.println("RestoParamList —> , ParamList\n");
         verifica(',');
         ParamList();
      } else {
         // vazio
         if (debug) System.out.println("RestoParamList -> Vazio");
      }
  }

  private void ListaCmd() {
      if ( (laToken == '{') || (laToken == WHILE) || (laToken == IDENT) || (laToken == IF) ) {
         if (debug) System.out.println("ListaCmd --> Cmd ListaCmd");
         Cmd();
         ListaCmd();
      } else {
         // vazio
         if (debug) System.out.println("ListaCmd --> Vazio");
      }
  }

  private void Bloco() {
      if (debug) System.out.println("Bloco --> { ListaCmd }");
      verifica('{');
      Cmd();
      verifica('}');
   }

  private void Cmd() {
      if (laToken == '{') {
         if (debug) System.out.println("Cmd --> Bloco\n");
         Bloco();
      } else if (laToken == WHILE) {
         if (debug) System.out.println("Cmd --> while ( E ) Cmd");
         verifica(WHILE);
         verifica('(');
         E();
         verifica(')');
         Cmd();
      } else if (laToken == IDENT) {
         if (debug) System.out.println("Cmd --> IDENT = E ;");
         verifica(IDENT);
         verifica('=');
         E();
         verifica(';');
      } else if (laToken == IF) {
         if (debug) System.out.println("Cmd --> if ( E ) Cmd RestoIf");
         verifica(IF);
         verifica('(');
         E();
         verifica(')');
         Cmd();
         RestoIf();
      } else {
         yyerror("Esperado {, IF, WHILE ou IDENT");
      }
  }

  private void RestoIf() {
      if (laToken == ELSE) {
         if (debug) System.out.println("RestoIf -> else Cmd");
         verifica(ELSE);
         Cmd();
      } else {
         // vazio
         if (debug) System.out.println("RestoIf -> Vazio");
      }
   }

  private void E() {
      if (debug) System.out.println("E -> T RestoE");
      T();
      RestoE();
  }

  private void RestoE() {
      if (laToken == '+') {
         if (debug) System.out.println("RestoE -> + T RestoE");
         verifica('+');
         T();
         RestoE();
      } else if (laToken == '-') {
         if (debug) System.out.println("RestoE -> - T RestoE");
         verifica('-');
         T();
         RestoE();
      } else {
         // vazio
         if (debug) System.out.println("RestoE -> Vazio");
      }
  }

  private void T() {
      if (debug) System.out.println("T -> F RestoT");
      F();
      RestoT();
  }

  private void RestoT() {
      if (laToken == '*') {
         if (debug) System.out.println("RestoT -> * F RestoT");
         verifica('*');
         F();
         RestoT();
      } else if (laToken == '/') {
         if (debug) System.out.println("RestoT -> / F RestoT");
         verifica('/');
         F();
         RestoT();
      } else {
         // vazio
         if (debug) System.out.println("RestoT -> Vazio");
      }
  }

  private void F() {
      if (laToken == IDENT) {
         if (debug) System.out.println("F -> IDENT");
         verifica(IDENT);
      } else if (laToken == NUM) {
         if (debug) System.out.println("F -> NUM");
         verifica(NUM);
      } else if (laToken == '(') {
         if (debug) System.out.println("F -> ( E )");
         verifica('(');
         E();
         verifica(')');
      } else {
         yyerror("Esperado IDENT, NUM ou '('");
      }
  }

  private void verifica(int expected) {
      if (laToken == expected)
         laToken = this.yylex();
      else {
         String expStr, laStr;       

		expStr = ((expected < BASE_TOKEN_NUM )
                ? ""+(char)expected
			     : tokenList[expected-BASE_TOKEN_NUM]);
         
		laStr = ((laToken < BASE_TOKEN_NUM )
                ? Character.toString(laToken)
                : tokenList[laToken-BASE_TOKEN_NUM]);

          yyerror( "esperado token: " + expStr +
                   " na entrada: " + laStr);
     }
   }

   /* metodo de acesso ao Scanner gerado pelo JFLEX */
   private int yylex() {
       int retVal = -1;
       try {
           yylval = new ParserVal(0); //zera o valor do token
           retVal = lexer.yylex(); //le a entrada do arquivo e retorna um token
       } catch (IOException e) {
           System.err.println("IO Error:" + e);
          }
       return retVal; //retorna o token para o Parser 
   }

  /* metodo de manipulacao de erros de sintaxe */
  public void yyerror (String error) {
     System.err.println("Erro: " + error);
     System.err.println("Entrada rejeitada");
     System.out.println("\n\nFalhou!!!");
     System.exit(1);
     
  }

  public void setDebug(boolean trace) {
      debug = true;
  }


  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param args   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] args) {
     AsdrSample parser = null;
     try {
         if (args.length == 0)
            parser = new AsdrSample(new InputStreamReader(System.in));
         else 
            parser = new  AsdrSample( new java.io.FileReader(args[0]));

          parser.setDebug(false);
          laToken = parser.yylex();          

          parser.Prog();
     
          if (laToken== Yylex.YYEOF)
             System.out.println("\n\nSucesso!");
          else     
             System.out.println("\n\nFalhou - esperado EOF.");               

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+args[0]+"\"");
        }
//        catch (java.io.IOException e) {
//          System.out.println("IO error scanning file \""+args[0]+"\"");
//          System.out.println(e);
//        }
//        catch (Exception e) {
//          System.out.println("Unexpected exception:");
//          e.printStackTrace();
//      }
    
  }
  
}

