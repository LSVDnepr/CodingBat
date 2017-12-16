package string2;

public class BobThere {
    /*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
     */


    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));
        System.out.println(bobThere("bbghgubommbo"));


    }




    public static boolean bobThere(String str) {
        if (str.length() < 3) return false;
        for (int i = 0; i < str.length();) {
            int ind=str.indexOf('b',i);
            if (ind==-1)break;
            if (ind+2<str.length()&&str.charAt(ind+2)=='b')return true;
            i=ind+2;

        }

        return false;
    }


}
