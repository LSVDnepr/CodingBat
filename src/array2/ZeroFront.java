package array2;

import java.util.Arrays;

public class ZeroFront {
    /*
    Return an array that contains the exact same numbers as the given array,
    but rearranged so that all the zeros are grouped at the start of the array.
    The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
    You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0})));


    }

    public static int[] zeroFront(int[] nums) {
        if (nums.length <= 1) return nums;
        int zeroInd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) continue;
            int temp = nums[zeroInd + 1];
            nums[zeroInd + 1] = nums[i];
            nums[i] = temp;
            zeroInd++;
        }
        return nums;
    }


}
