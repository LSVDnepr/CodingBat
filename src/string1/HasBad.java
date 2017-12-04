package string1;

public class HasBad {
    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
     */

    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));


    }


    public static boolean hasBad(String str) {
        if (str.length()<3)return false;
        return (str.indexOf("bad")==0||(str.indexOf("bad")==1));


    }



}
