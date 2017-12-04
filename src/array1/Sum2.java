package array1;

import java.util.Arrays;

public class Sum2 {
    /*
    Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
     */


    public static void main(String[] args) {
        System.out.println(sum2(new int[]{1,2,3}));
        System.out.println(sum2(new int[]{1,1}));
        System.out.println(sum2(new int[]{1,1,1,1}));
    }


    public static int sum2(int[] nums) {
        //<VARIANT1>
   /* if (nums.length==0)return 0;
    if (nums.length==1)return nums[0];
    return nums[0]+nums[1];*/
    //<VARIANT1>

        //<VARIANT2>
        int sum=0;
        for (int i=0;i<2&&i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;

        //</VARIANT2>




    }


}
