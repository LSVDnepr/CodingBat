package array2;

import java.util.Arrays;

public class Without10 {
    /*
    Return a version of the given array where all the 10's have been removed.
    The remaining elements should shift left towards the start of the array as needed,
    and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
    You may modify and return the given array or make a new array.

    withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
    withoutTen([10, 2, 10]) → [2, 0, 0]
    withoutTen([1, 99, 10]) → [1, 99, 0]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(withoutTen(new int[]{1, 10, 10, 2})));
        System.out.println(Arrays.toString(withoutTen(new int[]{10, 2, 10})));
        System.out.println(Arrays.toString(withoutTen(new int[]{1, 99, 10})));
        System.out.println(Arrays.toString(withoutTen(new int[]{10, 13, 10, 14})));

    }


    public static int[] withoutTen(int[] nums) {
        //make a new array solution
        //<VARIANT 1>
        /*int[] without10=new int[nums.length];
        for (int i=0,j=0;i<nums.length;i++){
            if (nums[i]==10)continue;
            without10[j++]=nums[i];

        }
        return without10;*/
        //</VARIANT 1>


        //<VARIANT 2> modify this array

        for (int i = 0, j = 0; j < nums.length; ) {
            if (i >= nums.length) {
                nums[j++] = 0;
                continue;
            }
            if (nums[i] != 10) {
                nums[j++] = nums[i];
            }
            i++;

        }
        return nums;
        //</VARIANT 2>


     /*   //<VARIANT 3> modify this array solution2
        int lastChecked = 0;
        int lastNot10 = -1;
        while (lastNot10 < nums.length - 1) {
            if (lastChecked == nums.length) {
                nums[++lastNot10] = 0;
                continue;
            }

            if (nums[lastChecked] != 10) {
                nums[++lastNot10] = nums[lastChecked];
            }

            lastChecked++;
        }

        return nums;
        //</VARIANT 3>*/


    }

}
