package string1;

public class NTwice {
    /*
    Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
     */


    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
        System.out.println(nTwice("Code", 4));
    }


    public static String nTwice(String str, int n) {
        if (str.length()<=n)return str+str;
        return str.substring(0,n).concat(str.substring(str.length()-n,str.length()));

    }


}
