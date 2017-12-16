package array3;

import java.util.Arrays;

public class CanBalance {
    /*
    Given a non-empty array, return true if there is a place to split the array so
    that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
canBalance([1, 1, 1, 1, 4]) → true
     */

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{10, 10}));
        System.out.println(canBalance(new int[]{1, 1, 1, 1, 4}));


    }


    /*public static boolean canBalance(int[] nums) {
        System.out.println("Анализируемый массив ");
        System.out.println(Arrays.toString(nums));
        if (nums.length<=1)return false;
        if (nums.length==2)return (nums[0]==nums[1]);
        for (int i=1;i<nums.length-1;i++){
            if (!compareSums(i,nums))continue;
            return compareSums(i,nums);

        }

        return false;
    }*/

    public static boolean canBalance(int[] nums) {
       /* System.out.println("Анализируемый массив ");
        System.out.println(Arrays.toString(nums));*/
        if (nums.length <= 1) return false;
        if (nums.length == 2) return (nums[0] == nums[1]);
        for (int i = 1; i < nums.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j < i) {
                    sum1 += nums[j];
                } else {
                    sum2 += nums[j];
                }
            }
          //  System.out.println("sum1="+sum1);
            //System.out.println("sum2="+sum2);
            if (sum1 != sum2) continue;
            return (sum1 == sum2);

        }

        return false;
    }


   /* public static boolean canBalance(int[] nums) {
        System.out.println("Анализируемый массив ");
        System.out.println(Arrays.toString(nums));
        if (nums.length <= 1) return false;
        if (nums.length == 2) return (nums[0] == nums[1]);
        for (int i = 1; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += (j < i ? nums[j] : (-nums[j]));
            }
            if (sum != 0) continue;
            return (sum == 0);

        }

        return false;
    }*/


    // int half2start=int half1End+1
    /*public static boolean compareSums(int half1End, int half2start, int[] nums){*/
    public static boolean compareSums(int half1End, int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < half1End) {
                sum1 += nums[i];
            } else {
                sum2 += nums[i];
            }
        }
        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        return sum1 == sum2;

    }

}
