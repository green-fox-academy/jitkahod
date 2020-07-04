public class RecursionStringsAgainAgain {

    public static void main(String[] args) {
        System.out.println(toYchar("xahoj"));
    }

    public static String toYchar(String s) {

        if (s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s.charAt(0) + toYchar(s.substring(1));
        } else {
            return s.charAt(0) + "*" + toYchar(s.substring(1));
        }

        // "xahoj" -> "yahoj"
        //  xahoj -> y + ahoj
        //          ahoj -> a+ hoj
        //                  hoj -> h + oj
        //                      oj -> o + j
        //                          j -> j + ""
        //                              "" -> ""
        // "bahojda" -> "bahojda"
        //return s.charAt(0) + s.substring(1);

        //System.out.println(s);
    }
}