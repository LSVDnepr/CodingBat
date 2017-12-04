package string1;

public class DeFront {
    /*
Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"

     */

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));

    }


    public static String deFront(String str) {
        if (str.length() == 0) return str;
        if (str.length() == 1) return (str.charAt(0) == 'a' ? str : "");
        if (str.charAt(0) == 'a') {
            return (str.charAt(1) == 'b' ? str : (String.valueOf(str.charAt(0)) + str.substring(2)));
        } else {
            return (str.charAt(1) == 'b' ? str.substring(1) : str.substring(2));
        }
    }


}
