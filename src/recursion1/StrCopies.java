package recursion1;

public class StrCopies {
    /*
    Given a string and a non-empty substring sub,
    compute recursively if at least n copies of sub appear in the string somewhere,
    possibly with overlapping. N will be non-negative.


strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
strCopies("iiijjj", "ii", 2) → true
     */

    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
        System.out.println(strCopies("iiijjj", "ii", 2));
    }

    public static boolean strCopies(String str, String sub, int n) {
        if (n==0)return true;
        int subInd=str.indexOf(sub);
        return subInd!=-1&&strCopies(str.substring(subInd+1),sub,n-1);

/*
        if (n == 0) return true;
        int len = sub.length();
        if (str.length() < len) return false;

        if (str.substring(0, len).equals(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        } else {
            return strCopies(str.substring(1), sub, n);
        }
*/


    }



}
