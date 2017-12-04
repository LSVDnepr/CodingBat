package string1;

public class WithoutX2 {
    /*

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
     */


    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
        System.out.println(withoutX2("xxHi"));
        System.out.println(withoutX2("xx"));
        System.out.println(withoutX2("xa"));
        System.out.println(withoutX2("axx"));
        System.out.println(withoutX2("x"));


    }

    public static String withoutX2(String str) {
        if (str.length() == 0) return "";
        if (str.length() == 1) return str.charAt(0) == 'x' ? "" : str;
        if (str.charAt(0) == 'x') {
            return str.charAt(1) == 'x' ? str.substring(2) : str.substring(1);
        } else {
            return str.charAt(1) == 'x' ? String.valueOf(str.charAt(0)) + str.substring(2) : str;
        }

    }


}
