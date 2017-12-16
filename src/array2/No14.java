package array2;

public class No14 {
    /*

Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
     */

    public static void main(String[] args) {
        System.out.println(no14(new int[]{1, 2, 3}));
        System.out.println(no14(new int[]{1, 2, 3, 4}));
        System.out.println(no14(new int[]{2, 3, 4}));

    }


    public static boolean no14(int[] nums) {
        boolean found1 = false;
        boolean found4 = false;
        for (int i : nums) {
            if (i == 1) {
                if (found4) return false;
                found1 = true;
            }
            if (i == 4) {
                if (found1) return false;
                found4 = true;
            }
        }

        return true;
    }


}
