package array1;

import java.util.Arrays;

public class Reverse3 {
    /*

Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3(new int[]{1,2,3})));
        System.out.println(Arrays.toString(reverse3(new int[]{9,11,5})));
        System.out.println(Arrays.toString(reverse3(new int[]{7,0,0})));
        System.out.println(Arrays.toString(reverse3(new int[]{12,10,8,7,5,3,1,1,0})));
        System.out.println(Arrays.toString(reverse3(new int[]{12,10,8,7,5,3})));
        System.out.println(Arrays.toString(reverse3(new int[]{17,77})));

    }


    public static int[] reverse3(int[] nums) {
        if (nums.length<=1)return nums;
        //<VARIANT1>
        /*int[]revNums=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            revNums[revNums.length-1-i]=nums[i];
        }
        return revNums;*/
        //</VARIANT1>

        //<VARIANT2>
        for (int i=0;i<nums.length/2;i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
        return nums;


        //</VARIANT2>



    }



}
