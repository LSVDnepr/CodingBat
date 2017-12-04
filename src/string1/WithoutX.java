package string1;

public class WithoutX {
    /*

Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
     */

    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        System.out.println(withoutX("x"));
        System.out.println(withoutX("sx"));
        System.out.println(withoutX("xx"));

    }


    public static String withoutX(String str) {
        if (str.length() == 0) return str;
        if (str.length() == 1) return (str.charAt(0) == 'x' ? "" : str);
        if (str.charAt(0) == 'x') {
            return ((str.charAt(str.length() - 1) == 'x') ? str.substring(1, str.length() - 1) : str.substring(1));
        } else {
            return ((str.charAt(str.length() - 1) == 'x') ? str.substring(0, str.length() - 1) : str);
        }
    }

}
