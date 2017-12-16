package string2;

public class MixString {
    /*
    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
    the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
     */

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There") );
        System.out.println(mixString("xxxx", "There"));



    }


    public static String mixString(String a, String b) {
        if (a.length()==0)return b;
        if (b.length()==0)return a;
        StringBuilder sb=new StringBuilder((a.length()+b.length()));
        int i=0;
        for (;i<Math.min(a.length(),b.length());i++){
            sb.append(a.charAt(i)).append(b.charAt(i));
        }
        if (a.length()==b.length())return sb.toString();
        sb.append((a.length()>b.length())?a.substring(i,a.length()):b.substring(i,b.length()));
        return sb.toString();

    }




}
