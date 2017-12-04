package warmup2;

public class StringX {
    /*

Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
     */


    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));

    }


    public static String stringX(String str) {
        if (str.length() <= 2) return str;
        if (str.indexOf('x') == -1) return str;
        return str.charAt(0) + str.substring(1, str.length() - 1).replace("x", "") + str.charAt(str.length() - 1);

}


}
