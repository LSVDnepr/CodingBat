package recursion1;

public class Count11 {
    /*
    Given a string, compute recursively (no loops) the number of "11" substrings in the string.
    The "11" substrings should not overlap.

count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
     */

    public static void main(String[] args) {
        System.out.println(count11("11abc11"));
        System.out.println(count11("abc11x11x11"));
        System.out.println(count11("111"));


    }


    public static int count11(String str) {
        if (str.length()<2)return 0;
        int ind11=str.indexOf("11");
        return ind11>=0?1+count11(str.substring(ind11+2)):0;

    }




}
