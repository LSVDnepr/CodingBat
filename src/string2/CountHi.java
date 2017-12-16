package string2;

public class CountHi {
    /*
    Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
     */

    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

    }


    public static int countHi(String str) {
        if (str.length() <= 1) return 0;
        int calc = 0;
        int ind;
        for (int i = 0; i < str.length(); ) {
            ind = str.indexOf("hi", i);
            if (ind == -1) break;
            calc++;
            i=ind+"hi".length();
        }
        return calc;
    }


}
