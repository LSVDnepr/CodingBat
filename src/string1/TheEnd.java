package string1;

public class TheEnd {
    /*

Given a string, return a string length 1 from its front, unless front is false,
in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
     */


    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));

    }


    public static String theEnd(String str, boolean front) {
        if (str.isEmpty())return str;
        return (front?str.substring(0,1):str.substring(str.length()-1,str.length()));

    }




}
