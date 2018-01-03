package string2;

public class StarOut {
    /*

Return a version of the given string, where for every star (*) in the string
the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
starOut("a*bc") → "c"
starOut("a*b") → ""
starOut("a*") → ""

     */

    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
        System.out.println(starOut("*ab**cd"));
        System.out.println(starOut("**aabc**cde**"));
        System.out.println(starOut("a*bc"));
        System.out.println(starOut("a*b"));
        System.out.println(starOut("a*"));


    }


    public static String starOut(String str) {
        if (str.length() == 0) return str;
        if (str.indexOf('*') == -1) return str;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '*') {
                if (i == 0) {
                    if (str.charAt(i + 1) != '*') result += str.charAt(i);
                    continue;
                }
                if (i == str.length() - 1) {
                    if ((str.charAt(i) != '*') && (str.charAt(i - 1) != '*')) result += str.charAt(i);
                    break;
                }

                if ((str.charAt(i - 1) != '*') && (str.charAt(i + 1) != '*')) {
                    result += str.charAt(i);
                }

            }

        }

        return result;


    }


}
