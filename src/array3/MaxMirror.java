package array3;

import java.util.Arrays;

public class MaxMirror {
    /*

We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array.


maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
maxMirror([21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9]) → 4
     */

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
        System.out.println(maxMirror(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));


    }

    public static int maxMirror(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int mirrorCalc = 0;
        for (int i = 0; i < nums.length; i++) {
            int calc = 0;
            for (int j = nums.length - 1, indFrom = i; j >= 0 && indFrom < nums.length; j--) {
                if (nums[j] == nums[indFrom]) {
                    calc++;
                    indFrom++;
                    continue;
                }
                if (calc > mirrorCalc) mirrorCalc = calc;
                calc = 0;
                indFrom = i;

            }
            if (calc > mirrorCalc) mirrorCalc = calc;
        }

        return mirrorCalc;
    }


}
