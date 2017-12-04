package string1;

public class MinCat {
    /*

Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string
so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
     */

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));


    }


    public static String minCat(String a, String b) {
        if (a.length()==b.length())return a.concat(b);
        /*if (a.length()>b.length()){
            int diff=a.length()-b.length();
            return a.substring(diff).concat(b);
        }else{
            int diff=b.length()-a.length();
            return a.concat(b.substring(diff));
        }*/

        int diff=Math.abs(a.length()-b.length());
        return (a.length()>b.length()?a.substring(diff).concat(b):a.concat(b.substring(diff)));


        //return (a.length()>b.length()?a.substring(a.length()-b.length()).concat(b):a.concat(b.substring(b.length()-a.length())));

    }



}
