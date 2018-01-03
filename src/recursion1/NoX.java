package recursion1;

public class NoX {
    /*
    Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
     */

    public static void main(String[] args) {
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));

    }


    public static String noX(String str) {
        int xInd=str.indexOf('x');
        if (xInd==-1)return str;
        return str.substring(0,xInd)+noX(str.substring(xInd+1));
    }



}
