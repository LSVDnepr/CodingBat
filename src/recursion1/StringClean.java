package recursion1;

public class StringClean {
    /*

Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char.
So "yyzzza" yields "yza".

stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
     */

    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("Hello"));
        System.out.println(stringClean("yyyyyyyy"));


    }


    public static String stringClean(String str) {

        if (str.length()<2)return str;
        return str.charAt(0)==str.charAt(1)?stringClean(str.substring(1)):str.charAt(0)+stringClean(str.substring(1));

    }


       /*if (str.length()<=1)return str;
        int ind=1;
        for (int i=1;i<str.length();i++){
            if (str.charAt(0)!=str.charAt(i))break;
            ind++;
        }
        return str.charAt(0)+stringClean(str.substring(ind));*/


}
