package string2;

public class EndOther {
    /*

Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
     */

    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc") );
        System.out.println(endOther("abc", "abXabc") );
        System.out.println(endOther("aBc",""));


    }


    public static boolean endOther(String a, String b) {
       // if ((a.length()==b.length())&&(a.equalsIgnoreCase(b)))return true;
        a=a.toLowerCase();
        b=b.toLowerCase();
        return  (a.endsWith(b))||(b.endsWith(a));


    }





}
