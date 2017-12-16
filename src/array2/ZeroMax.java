package array2;

import java.util.Arrays;

public class ZeroMax {
    /*

Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
     */


    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroMax(new int[]{0,5,0,3})));
        System.out.println(Arrays.toString(zeroMax(new int[]{0,4,0,3})));
        System.out.println(Arrays.toString(zeroMax(new int[]{0,1,0})));


    }


    public static int[] zeroMax(int[] nums) {
        if (nums.length<=1)return nums;
        int oddMax=Integer.MIN_VALUE;
        for (int i=nums.length-1;i>=0;i--){
            if (nums[i]%2!=0&&nums[i]>oddMax)oddMax=nums[i];
            if ((nums[i]==0)&&(oddMax!=Integer.MIN_VALUE))nums[i]=oddMax;
        }
        return nums;
    }






}
