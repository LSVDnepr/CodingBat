package array1;

public class Sum3 {
    /*

Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
     */

    public static void main(String[] args) {
        System.out.println(sum3(new int[]{1, 2, 3}));
        System.out.println(sum3(new int[]{5, 11, 2}));
        System.out.println(sum3(new int[]{7, 0, 0}));

    }


    public static int sum3(int[] nums) {
        int sum=0;
        for (int i:nums)sum+=i;
        return sum;

    }

}
