package string2;

public class XyzMiddle {
    /*

Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
     */

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
        System.out.println(xyzMiddle("xyzAxyzBBB"));
        System.out.println(xyzMiddle("xyzxyzxyzBxyzxyz"));
        System.out.println(xyzMiddle("xy"));


    }



    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) return false;
        int middle = str.length() / 2;
        int xyzInd = str.indexOf("xyz", middle - 2);
        return (Math.abs(xyzInd - (str.length() - 1 - (xyzInd + 2))) <= 1);

    }


}
