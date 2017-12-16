package string2;

public class DoubleChar {
    /*

Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));

    }


    public static String doubleChar(String str) {
        if (str.isEmpty())return str;
        StringBuilder sb=new StringBuilder(str.length()*2);
        for (int i=0;i<str.length();i++){
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        return sb.toString();
    }



}
