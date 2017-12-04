package warmup2;

public class StringMatch {
    /*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
    substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
     */


    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
        System.out.println(stringMatch("aabbccdd", "abbbxxd"));

    }

    public static int stringMatch(String a, String b) {
        if ((a.length()<=1)||(b.length()<=1)) return 0;
        int matchCalc=0;
        if (a.length()<=b.length()){
            for (int i=0;i<a.length()-1;i++){
                if ((b.indexOf(a.substring(i,i+2)))==i){
                    matchCalc++;
                }
            }
        }else{
            for (int i=0;i<b.length()-1;i++){
                if ((a.indexOf(b.substring(i,i+2)))==i){
                    matchCalc++;
                }
            }
        }

        return matchCalc;
    }






}
