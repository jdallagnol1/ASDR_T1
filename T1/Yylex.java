// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: asdr_lex.flex


@SuppressWarnings("fallthrough")
class Yylex {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\126\u0100\1\u2600\1\u0100\1\u2700"+
    "\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\53\u0100\1\u2d00\10\u2e00"+
    "\31\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200\1\u3300"+
    "\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u0100\1\u3a00"+
    "\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100\1\u4200"+
    "\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900\1\u4a00"+
    "\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00\1\u4f00\1\u5000\1\u5100"+
    "\3\u0100\1\u5200\1\u5300\1\u5400\11\u1f00\1\u5500\4\u0100\1\u5600"+
    "\17\u1f00\2\u0100\1\u5700\41\u1f00\2\u0100\1\u5800\1\u5900\2\u1f00"+
    "\1\u5a00\1\u5b00\27\u0100\1\u5c00\4\u0100\1\u5d00\1\u5e00\41\u1f00"+
    "\1\u5f00\1\u0100\1\u6000\1\u6100\11\u1f00\1\u6200\22\u1f00\1\u6300"+
    "\1\u1f00\1\u6400\1\u6500\1\u1f00\1\u6600\1\u6700\1\u6800\1\u6900"+
    "\2\u1f00\1\u6a00\4\u1f00\1\u6b00\1\u6c00\1\u6d00\1\u6e00\1\u1f00"+
    "\1\u6f00\2\u1f00\1\u7000\1\u7100\1\u7200\2\u1f00\1\u7300\1\u1f00"+
    "\1\u7400\14\u1f00\1\u7500\4\u1f00\246\u0100\1\u7600\20\u0100\1\u7700"+
    "\1\u7800\25\u0100\1\u7900\34\u0100\1\u7a00\14\u1f00\2\u0100\1\u7b00"+
    "\5\u1f00\23\u0100\1\u7c00\17\u0100\1\u7d00\u0adc\u1f00\1\u7e00\1\u7f00"+
    "\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\1\1\2\2\2\3\1\2\16\0\4\4\1\2"+
    "\3\4\1\5\3\4\6\6\1\4\1\6\12\7\1\4"+
    "\1\6\1\4\1\6\3\4\1\10\1\11\1\12\1\11"+
    "\1\13\1\14\7\11\1\15\1\16\2\11\1\17\1\11"+
    "\1\20\6\11\4\4\1\21\1\4\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\11\1\30\1\31\2\11\1\32"+
    "\1\11\1\33\1\34\2\11\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\3\11\1\6\1\4\1\6\1\4\6\0"+
    "\1\43\32\0\2\4\4\11\4\4\1\11\2\4\1\0"+
    "\7\4\1\11\4\4\1\11\5\4\27\11\1\4\37\11"+
    "\1\4\u01ca\11\4\4\14\11\16\4\5\11\7\4\1\11"+
    "\1\4\1\11\21\4\160\0\5\11\1\4\2\11\2\4"+
    "\4\11\1\4\1\11\6\4\1\11\1\4\3\11\1\4"+
    "\1\11\1\4\24\11\1\4\123\11\1\4\213\11\1\4"+
    "\5\0\2\4\246\11\1\4\46\11\2\4\1\11\6\4"+
    "\51\11\6\4\1\11\1\4\55\0\1\4\1\0\1\4"+
    "\2\0\1\4\2\0\1\4\1\0\10\4\33\11\4\4"+
    "\4\11\15\4\6\0\5\4\1\11\4\4\13\0\1\4"+
    "\1\0\3\4\53\11\37\0\4\4\2\11\1\0\143\11"+
    "\1\4\1\11\10\0\1\4\6\0\2\11\2\0\1\4"+
    "\4\0\2\11\12\0\3\11\2\4\1\11\17\4\1\0"+
    "\1\11\1\0\36\11\33\0\2\4\131\11\13\0\1\11"+
    "\16\4\12\0\41\11\11\0\2\11\4\4\1\11\2\4"+
    "\1\0\30\11\4\0\1\11\11\0\1\11\3\0\1\11"+
    "\5\0\22\4\31\11\3\0\4\4\13\11\5\4\30\11"+
    "\1\4\6\11\1\4\2\0\6\4\10\0\52\11\72\0"+
    "\66\11\3\0\1\11\22\0\1\11\7\0\12\11\2\0"+
    "\2\4\12\0\1\4\20\11\3\0\1\4\10\11\2\4"+
    "\2\11\2\4\26\11\1\4\7\11\1\4\1\11\3\4"+
    "\4\11\2\4\1\0\1\11\7\0\2\4\2\0\2\4"+
    "\3\0\1\11\10\4\1\0\4\4\2\11\1\4\3\11"+
    "\2\0\2\4\12\0\4\11\7\4\2\11\1\4\1\0"+
    "\2\4\3\0\1\4\6\11\4\4\2\11\2\4\26\11"+
    "\1\4\7\11\1\4\2\11\1\4\2\11\1\4\2\11"+
    "\2\4\1\0\1\4\5\0\4\4\2\0\2\4\3\0"+
    "\3\4\1\0\7\4\4\11\1\4\1\11\7\4\14\0"+
    "\3\11\1\0\13\4\3\0\1\4\11\11\1\4\3\11"+
    "\1\4\26\11\1\4\7\11\1\4\2\11\1\4\5\11"+
    "\2\4\1\0\1\11\10\0\1\4\3\0\1\4\3\0"+
    "\2\4\1\11\17\4\2\11\2\0\2\4\12\0\1\4"+
    "\1\11\7\4\1\11\6\0\1\4\3\0\1\4\10\11"+
    "\2\4\2\11\2\4\26\11\1\4\7\11\1\4\2\11"+
    "\1\4\5\11\2\4\1\0\1\11\7\0\2\4\2\0"+
    "\2\4\3\0\7\4\3\0\4\4\2\11\1\4\3\11"+
    "\2\0\2\4\12\0\1\4\1\11\20\4\1\0\1\11"+
    "\1\4\6\11\3\4\3\11\1\4\4\11\3\4\2\11"+
    "\1\4\1\11\1\4\2\11\3\4\2\11\3\4\3\11"+
    "\3\4\14\11\4\4\5\0\3\4\3\0\1\4\4\0"+
    "\2\4\1\11\6\4\1\0\16\4\12\0\11\4\1\11"+
    "\6\4\5\0\10\11\1\4\3\11\1\4\27\11\1\4"+
    "\20\11\2\4\1\0\1\11\7\0\1\4\3\0\1\4"+
    "\4\0\7\4\2\0\1\4\3\11\2\4\1\11\2\4"+
    "\2\11\2\0\2\4\12\0\20\4\1\11\3\0\1\4"+
    "\10\11\1\4\3\11\1\4\27\11\1\4\12\11\1\4"+
    "\5\11\2\4\1\0\1\11\7\0\1\4\3\0\1\4"+
    "\4\0\7\4\2\0\6\4\2\11\1\4\2\11\2\0"+
    "\2\4\12\0\1\4\2\11\1\0\14\4\4\0\11\11"+
    "\1\4\3\11\1\4\51\11\2\0\1\11\7\0\1\4"+
    "\3\0\1\4\4\0\1\11\5\4\3\11\1\0\7\4"+
    "\3\11\2\0\2\4\12\0\12\4\6\11\1\4\3\0"+
    "\1\4\22\11\3\4\30\11\1\4\11\11\1\4\1\11"+
    "\2\4\7\11\3\4\1\0\4\4\6\0\1\4\1\0"+
    "\1\4\10\0\6\4\12\0\2\4\2\0\15\4\60\11"+
    "\1\0\2\11\7\0\4\4\10\11\10\0\1\4\12\0"+
    "\47\4\2\11\1\4\1\11\1\4\5\11\1\4\30\11"+
    "\1\4\1\11\1\4\12\11\1\0\2\11\11\0\1\11"+
    "\2\4\5\11\1\4\1\11\1\4\7\0\1\4\12\0"+
    "\2\4\4\11\40\4\1\11\27\4\2\0\6\4\12\0"+
    "\13\4\1\0\1\4\1\0\1\4\1\0\4\4\2\0"+
    "\10\11\1\4\44\11\4\4\24\0\1\4\2\0\5\11"+
    "\13\0\1\4\44\0\11\4\1\0\71\4\53\11\24\0"+
    "\1\11\12\0\6\4\6\11\4\0\4\11\3\0\1\11"+
    "\3\0\2\11\7\0\3\11\4\0\15\11\14\0\1\11"+
    "\17\0\2\4\46\11\1\4\1\11\5\4\1\11\2\4"+
    "\53\11\1\4\115\11\1\4\4\11\2\4\7\11\1\4"+
    "\1\11\1\4\4\11\2\4\51\11\1\4\4\11\2\4"+
    "\41\11\1\4\4\11\2\4\7\11\1\4\1\11\1\4"+
    "\4\11\2\4\17\11\1\4\71\11\1\4\4\11\2\4"+
    "\103\11\2\4\3\0\40\4\20\11\20\4\126\11\2\4"+
    "\6\11\3\4\u016c\11\2\4\21\11\1\4\32\11\5\4"+
    "\113\11\3\4\13\11\7\4\22\11\4\0\11\4\23\11"+
    "\3\0\13\4\22\11\2\0\14\4\15\11\1\4\3\11"+
    "\1\4\2\0\14\4\64\11\40\0\3\4\1\11\3\4"+
    "\2\11\1\0\2\4\12\0\41\4\17\0\6\4\131\11"+
    "\7\4\5\11\2\0\42\11\1\0\1\11\5\4\106\11"+
    "\12\4\37\11\1\4\14\0\4\4\14\0\12\4\12\0"+
    "\36\11\2\4\5\11\13\4\54\11\4\4\32\11\6\4"+
    "\12\0\46\4\27\11\5\0\4\4\65\11\12\0\1\4"+
    "\35\0\2\4\13\0\6\4\12\0\15\4\1\11\10\4"+
    "\16\0\1\4\20\0\61\4\5\0\57\11\21\0\10\11"+
    "\3\4\12\0\21\4\11\0\14\4\3\0\36\11\15\0"+
    "\2\11\12\0\54\11\16\0\14\4\44\11\24\0\10\4"+
    "\12\0\3\4\3\11\12\0\44\11\2\4\11\11\7\4"+
    "\53\11\2\4\3\11\20\4\3\0\1\4\25\0\4\11"+
    "\1\0\6\11\1\0\2\11\3\0\1\11\5\4\300\11"+
    "\100\0\26\11\2\4\6\11\2\4\46\11\2\4\6\11"+
    "\2\4\10\11\1\4\1\11\1\4\1\11\1\4\1\11"+
    "\1\4\37\11\2\4\65\11\1\4\7\11\1\4\1\11"+
    "\3\4\3\11\1\4\7\11\3\4\4\11\2\4\6\11"+
    "\4\4\15\11\5\4\3\11\1\4\7\11\16\4\5\0"+
    "\30\4\2\3\5\0\20\4\2\11\23\4\1\11\13\4"+
    "\5\0\1\4\12\0\1\4\1\11\15\4\1\11\20\4"+
    "\15\11\3\4\41\11\17\4\15\0\4\4\1\0\3\4"+
    "\14\0\21\4\1\11\4\4\1\11\2\4\12\11\1\4"+
    "\1\11\3\4\5\11\6\4\1\11\1\4\1\11\1\4"+
    "\1\11\1\4\4\11\1\4\13\11\2\4\4\11\5\4"+
    "\5\11\4\4\1\11\21\4\51\11\u0177\4\345\11\6\4"+
    "\4\11\3\0\2\11\14\4\46\11\1\4\1\11\5\4"+
    "\1\11\2\4\70\11\7\4\1\11\17\4\1\0\27\11"+
    "\11\4\7\11\1\4\7\11\1\4\7\11\1\4\7\11"+
    "\1\4\7\11\1\4\7\11\1\4\7\11\1\4\7\11"+
    "\1\4\40\0\57\4\1\11\325\4\3\11\31\4\11\11"+
    "\6\0\1\4\5\11\2\4\5\11\4\4\126\11\2\4"+
    "\2\0\2\4\3\11\1\4\132\11\1\4\4\11\5\4"+
    "\53\11\1\4\136\11\21\4\40\11\60\4\320\11\100\4"+
    "\215\11\103\4\56\11\2\4\15\11\3\4\20\11\12\0"+
    "\2\11\24\4\57\11\1\0\4\4\12\0\1\4\37\11"+
    "\2\0\120\11\2\0\45\4\11\11\2\4\147\11\2\4"+
    "\100\11\5\4\2\11\1\4\1\11\1\4\5\11\30\4"+
    "\20\11\1\0\3\11\1\0\4\11\1\0\27\11\5\0"+
    "\4\4\1\0\13\4\1\11\7\4\64\11\14\4\2\0"+
    "\62\11\22\0\12\4\12\0\6\4\22\0\6\11\3\4"+
    "\1\11\1\4\2\11\13\0\34\11\10\0\2\4\27\11"+
    "\15\0\14\4\35\11\3\4\4\0\57\11\16\0\16\4"+
    "\1\11\12\0\6\4\5\11\1\0\12\11\12\0\5\11"+
    "\1\4\51\11\16\0\11\4\3\11\1\0\10\11\2\0"+
    "\2\4\12\0\6\4\27\11\3\4\1\11\3\0\62\11"+
    "\1\0\1\11\3\0\2\11\2\0\5\11\2\0\1\11"+
    "\1\0\1\11\30\4\3\11\2\4\13\11\5\0\2\4"+
    "\3\11\2\0\12\4\6\11\2\4\6\11\2\4\6\11"+
    "\11\4\7\11\1\4\7\11\1\4\53\11\1\4\16\11"+
    "\6\4\163\11\10\0\1\4\2\0\2\4\12\0\6\4"+
    "\244\11\14\4\27\11\4\4\61\11\4\4\u0100\3\156\11"+
    "\2\4\152\11\46\4\7\11\14\4\5\11\5\4\1\11"+
    "\1\0\12\11\1\4\15\11\1\4\5\11\1\4\1\11"+
    "\1\4\2\11\1\4\2\11\1\4\154\11\41\4\153\11"+
    "\22\4\100\11\2\4\66\11\50\4\15\11\3\4\20\0"+
    "\20\4\20\0\3\4\2\11\30\4\3\11\31\4\1\11"+
    "\6\4\5\11\1\4\207\11\2\4\1\0\4\4\1\11"+
    "\13\4\12\0\7\4\32\11\4\4\1\11\1\4\32\11"+
    "\13\4\131\11\3\4\6\11\2\4\6\11\2\4\6\11"+
    "\2\4\3\11\3\4\2\11\3\4\2\11\22\4\3\0"+
    "\4\4\14\11\1\4\32\11\1\4\23\11\1\4\2\11"+
    "\1\4\17\11\2\4\16\11\42\4\173\11\105\4\65\11"+
    "\210\4\1\0\202\4\35\11\3\4\61\11\17\4\1\0"+
    "\37\4\40\11\15\4\36\11\5\4\46\11\5\0\5\4"+
    "\36\11\2\4\44\11\4\4\10\11\1\4\5\11\52\4"+
    "\236\11\2\4\12\0\6\4\44\11\4\4\44\11\4\4"+
    "\50\11\10\4\64\11\14\4\13\11\1\4\17\11\1\4"+
    "\7\11\1\4\2\11\1\4\13\11\1\4\17\11\1\4"+
    "\7\11\1\4\2\11\103\4\67\11\11\4\26\11\12\4"+
    "\10\11\30\4\6\11\1\4\52\11\1\4\11\11\105\4"+
    "\6\11\2\4\1\11\1\4\54\11\1\4\2\11\3\4"+
    "\1\11\2\4\27\11\12\4\27\11\11\4\37\11\101\4"+
    "\23\11\1\4\2\11\12\4\26\11\12\4\32\11\106\4"+
    "\70\11\6\4\2\11\100\4\1\11\3\0\1\4\2\0"+
    "\5\4\4\0\4\11\1\4\3\11\1\4\35\11\2\4"+
    "\3\0\4\4\1\0\40\4\35\11\3\4\35\11\43\4"+
    "\10\11\1\4\34\11\2\0\31\4\66\11\12\4\26\11"+
    "\12\4\23\11\15\4\22\11\156\4\111\11\67\4\63\11"+
    "\15\4\63\11\15\4\44\11\4\0\10\4\12\0\u0146\4"+
    "\52\11\1\4\2\0\3\4\2\11\113\4\3\0\35\11"+
    "\12\4\1\11\10\4\26\11\13\0\37\4\22\11\4\0"+
    "\52\4\25\11\33\4\27\11\11\4\3\0\65\11\17\0"+
    "\37\4\13\0\2\11\2\0\1\11\11\4\4\0\55\11"+
    "\13\0\2\4\1\0\4\4\1\0\12\4\1\0\2\4"+
    "\31\11\7\4\12\0\6\4\3\0\44\11\16\0\1\4"+
    "\12\0\4\4\1\11\2\0\1\11\10\4\43\11\1\0"+
    "\2\4\1\11\11\4\3\0\60\11\16\0\4\11\4\4"+
    "\4\0\1\4\14\0\1\11\1\4\1\11\43\4\22\11"+
    "\1\4\31\11\14\0\6\4\1\0\2\11\1\0\76\4"+
    "\7\11\1\4\1\11\1\4\4\11\1\4\17\11\1\4"+
    "\12\11\7\4\57\11\14\0\5\4\12\0\6\4\4\0"+
    "\1\4\10\11\2\4\2\11\2\4\26\11\1\4\7\11"+
    "\1\4\2\11\1\4\5\11\1\4\2\0\1\11\7\0"+
    "\2\4\2\0\2\4\3\0\2\4\1\11\6\4\1\0"+
    "\5\4\5\11\2\0\2\4\7\0\3\4\5\0\213\4"+
    "\65\11\22\0\4\11\5\4\12\0\4\4\1\0\3\11"+
    "\36\4\60\11\24\0\2\11\1\4\1\11\10\4\12\0"+
    "\246\4\57\11\7\0\2\4\11\0\27\4\4\11\2\0"+
    "\42\4\60\11\21\0\3\4\1\11\13\4\12\0\46\4"+
    "\53\11\15\0\1\11\7\4\12\0\66\4\33\11\2\4"+
    "\17\0\4\4\12\0\6\4\7\11\271\4\54\11\17\0"+
    "\145\4\100\11\12\0\25\4\10\11\2\4\1\11\2\4"+
    "\10\11\1\4\2\11\1\4\30\11\6\0\1\4\2\0"+
    "\2\4\4\0\1\11\1\0\1\11\2\0\14\4\12\0"+
    "\106\4\10\11\2\4\47\11\7\0\2\4\7\0\1\11"+
    "\1\4\1\11\1\0\33\4\1\11\12\0\50\11\7\0"+
    "\1\11\4\0\10\4\1\0\10\4\1\11\13\0\56\11"+
    "\20\0\3\4\1\11\22\4\111\11\7\4\11\11\1\4"+
    "\45\11\10\0\1\4\10\0\1\11\17\4\12\0\30\4"+
    "\36\11\2\4\26\0\1\4\16\0\111\4\7\11\1\4"+
    "\2\11\1\4\46\11\6\0\3\4\1\0\1\4\2\0"+
    "\1\4\7\0\1\11\1\0\10\4\12\0\6\4\6\11"+
    "\1\4\2\11\1\4\40\11\5\0\1\4\2\0\1\4"+
    "\5\0\1\11\7\4\12\0\u0136\4\23\11\4\0\11\4"+
    "\2\0\1\11\1\0\15\11\1\4\42\11\7\0\3\4"+
    "\5\0\15\4\12\0\126\4\1\11\54\4\4\11\37\4"+
    "\232\11\146\4\157\11\21\4\304\11\u014c\4\141\11\17\4"+
    "\60\11\21\0\6\11\17\0\252\4\107\11\271\4\71\11"+
    "\7\4\37\11\1\4\12\0\6\4\117\11\1\4\12\0"+
    "\6\4\36\11\2\4\5\0\13\4\60\11\7\0\11\4"+
    "\4\11\14\4\12\0\11\4\25\11\5\4\23\11\260\4"+
    "\100\11\200\4\113\11\4\4\1\0\1\11\67\0\7\4"+
    "\4\0\15\11\100\4\2\11\1\4\1\11\1\0\13\4"+
    "\2\0\16\4\370\11\10\4\326\11\52\4\11\11\u01e7\4"+
    "\4\11\1\4\7\11\1\4\2\11\1\4\43\11\17\4"+
    "\1\11\35\4\3\11\2\4\1\11\16\4\4\11\10\4"+
    "\u018c\11\4\4\153\11\5\4\15\11\3\4\11\11\7\4"+
    "\12\11\3\4\2\0\1\4\4\0\134\4\56\0\2\4"+
    "\27\0\u011e\4\5\0\3\4\26\0\2\4\7\0\36\4"+
    "\4\0\224\4\3\0\273\4\125\11\1\4\107\11\1\4"+
    "\2\11\2\4\1\11\2\4\2\11\2\4\4\11\1\4"+
    "\14\11\1\4\1\11\1\4\7\11\1\4\101\11\1\4"+
    "\4\11\2\4\10\11\1\4\7\11\1\4\34\11\1\4"+
    "\4\11\1\4\5\11\1\4\1\11\3\4\7\11\1\4"+
    "\u0154\11\2\4\31\11\1\4\31\11\1\4\37\11\1\4"+
    "\31\11\1\4\37\11\1\4\31\11\1\4\37\11\1\4"+
    "\31\11\1\4\37\11\1\4\31\11\1\4\10\11\2\4"+
    "\151\0\4\4\62\0\10\4\1\0\16\4\1\0\26\4"+
    "\5\0\1\4\17\0\120\4\37\11\6\4\6\11\325\4"+
    "\7\0\1\4\21\0\2\4\7\0\1\4\2\0\1\4"+
    "\5\0\5\4\76\11\41\4\1\0\160\4\55\11\3\4"+
    "\7\0\7\11\2\4\12\0\4\4\1\11\u0141\4\36\11"+
    "\1\0\21\4\54\11\16\0\5\4\1\11\320\4\34\11"+
    "\16\0\346\4\7\11\1\4\4\11\1\4\2\11\1\4"+
    "\17\11\1\4\305\11\13\4\7\0\51\4\104\11\7\0"+
    "\1\11\4\4\12\0\u0156\4\1\11\117\4\4\11\1\4"+
    "\33\11\1\4\2\11\1\4\1\11\2\4\1\11\1\4"+
    "\12\11\1\4\4\11\1\4\1\11\1\4\1\11\6\4"+
    "\1\11\4\4\1\11\1\4\1\11\1\4\1\11\1\4"+
    "\3\11\1\4\2\11\1\4\1\11\2\4\1\11\1\4"+
    "\1\11\1\4\1\11\1\4\1\11\1\4\1\11\1\4"+
    "\2\11\1\4\1\11\2\4\4\11\1\4\7\11\1\4"+
    "\4\11\1\4\4\11\1\4\1\11\1\4\12\11\1\4"+
    "\21\11\5\4\3\11\1\4\5\11\1\4\21\11\u0134\4"+
    "\12\0\6\4\340\11\40\4\72\11\6\4\336\11\2\4"+
    "\u0182\11\16\4\u0131\11\37\4\36\11\342\4\113\11\5\4"+
    "\u0160\11\121\4\1\0\36\4\140\0\200\4\360\0\20\4";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[32768];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\16\3\1\6"+
    "\1\3\1\7\12\3\1\10\6\3\1\11\1\3\1\12"+
    "\1\13\1\14\4\3\1\15\1\16\2\3\1\17\1\3"+
    "\1\20\2\3\1\21\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\154\0\44\0\220\0\264\0\330"+
    "\0\374\0\u0120\0\u0144\0\u0168\0\u018c\0\u01b0\0\u01d4\0\u01f8"+
    "\0\u021c\0\u0240\0\u0264\0\u0288\0\264\0\u02ac\0\264\0\u02d0"+
    "\0\u02f4\0\u0318\0\u033c\0\u0360\0\u0384\0\u03a8\0\u03cc\0\u03f0"+
    "\0\u0414\0\264\0\u0438\0\u045c\0\u0480\0\u04a4\0\u04c8\0\u04ec"+
    "\0\264\0\u0510\0\264\0\264\0\264\0\u0534\0\u0558\0\u057c"+
    "\0\u05a0\0\264\0\264\0\u05c4\0\u05e8\0\264\0\u060c\0\264"+
    "\0\u0630\0\u0654\0\264\0\264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\2\1\4\1\5\1\6\13\7"+
    "\1\10\1\7\1\11\1\12\1\13\1\7\1\14\5\7"+
    "\1\15\1\7\1\16\1\17\46\0\2\3\41\0\2\7"+
    "\3\0\1\7\1\0\11\7\1\20\23\7\7\0\1\6"+
    "\34\0\2\7\3\0\1\7\1\0\37\7\3\0\1\7"+
    "\1\0\25\7\1\21\11\7\3\0\1\7\1\0\25\7"+
    "\1\22\11\7\3\0\1\7\1\0\23\7\1\23\13\7"+
    "\3\0\1\7\1\0\13\7\1\24\6\7\1\25\6\7"+
    "\1\26\5\7\3\0\1\7\1\0\20\7\1\27\3\7"+
    "\1\30\12\7\3\0\1\7\1\0\26\7\1\31\10\7"+
    "\3\0\1\7\1\0\25\7\1\32\11\7\3\0\1\7"+
    "\1\0\21\7\1\33\15\7\3\0\1\7\1\0\10\7"+
    "\1\34\26\7\3\0\1\7\1\0\25\7\1\35\11\7"+
    "\3\0\1\7\1\0\31\7\1\36\5\7\3\0\1\7"+
    "\1\0\27\7\1\37\7\7\3\0\1\7\1\0\23\7"+
    "\1\40\13\7\3\0\1\7\1\0\24\7\1\41\12\7"+
    "\3\0\1\7\1\0\30\7\1\42\6\7\3\0\1\7"+
    "\1\0\31\7\1\43\5\7\3\0\1\7\1\0\22\7"+
    "\1\44\14\7\3\0\1\7\1\0\22\7\1\45\14\7"+
    "\3\0\1\7\1\0\1\7\1\46\35\7\3\0\1\7"+
    "\1\0\23\7\1\47\13\7\3\0\1\7\1\0\14\7"+
    "\1\50\22\7\3\0\1\7\1\0\17\7\1\51\17\7"+
    "\3\0\1\7\1\0\27\7\1\52\7\7\3\0\1\7"+
    "\1\0\15\7\1\53\21\7\3\0\1\7\1\0\17\7"+
    "\1\54\17\7\3\0\1\7\1\0\16\7\1\55\20\7"+
    "\3\0\1\7\1\0\23\7\1\56\13\7\3\0\1\7"+
    "\1\0\3\7\1\57\33\7\3\0\1\7\1\0\17\7"+
    "\1\60\17\7\3\0\1\7\1\0\23\7\1\61\13\7"+
    "\3\0\1\7\1\0\17\7\1\62\17\7\3\0\1\7"+
    "\1\0\17\7\1\63\17\7\3\0\1\7\1\0\4\7"+
    "\1\64\32\7\3\0\1\7\1\0\13\7\1\65\23\7"+
    "\3\0\1\7\1\0\17\7\1\66\17\7\3\0\1\7"+
    "\1\0\12\7\1\67\24\7\3\0\1\7\1\0\24\7"+
    "\1\70\12\7\3\0\1\7\1\0\7\7\1\71\27\7"+
    "\3\0\1\7\1\0\5\7\1\72\1\73\30\7\3\0"+
    "\1\7\1\0\5\7\1\74\27\7";

  private static int [] zzUnpacktrans() {
    int [] result = new int[1656];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\67\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  private AsdrSample yyparser;

  public Yylex(java.io.Reader r, AsdrSample yyparser) {
    this(r);
    this.yyparser = yyparser;
  }




  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Erro lexico: caracter invalido: <" + yytext() + ">");
            }
          // fall through
          case 19: break;
          case 2:
            { 
            }
          // fall through
          case 20: break;
          case 3:
            { return AsdrSample.IDENT;
            }
          // fall through
          case 21: break;
          case 4:
            { return yytext().charAt(0);
            }
          // fall through
          case 22: break;
          case 5:
            { return AsdrSample.NUM;
            }
          // fall through
          case 23: break;
          case 6:
            { return AsdrSample.FI;
            }
          // fall through
          case 24: break;
          case 7:
            { return AsdrSample.IF;
            }
          // fall through
          case 25: break;
          case 8:
            { return AsdrSample.INT;
            }
          // fall through
          case 26: break;
          case 9:
            { return AsdrSample.ELSE;
            }
          // fall through
          case 27: break;
          case 10:
            { return AsdrSample.FUNC;
            }
          // fall through
          case 28: break;
          case 11:
            { return AsdrSample.TRUE;
            }
          // fall through
          case 29: break;
          case 12:
            { return AsdrSample.VOID;
            }
          // fall through
          case 30: break;
          case 13:
            { return AsdrSample.FALSE;
            }
          // fall through
          case 31: break;
          case 14:
            { return AsdrSample.WHILE;
            }
          // fall through
          case 32: break;
          case 15:
            { return AsdrSample.DOUBLE;
            }
          // fall through
          case 33: break;
          case 16:
            { return AsdrSample.BOOLEAN;
            }
          // fall through
          case 34: break;
          case 17:
            { yyparser.setDebug(true);
            }
          // fall through
          case 35: break;
          case 18:
            { yyparser.setDebug(false);
            }
          // fall through
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
