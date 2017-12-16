package array2;

public class BigDiff {
    /*
    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
     */

    public static void main(String[] args) {
        System.out.println(bigDiff(new int[]{10, 3, 5, 6}));
        System.out.println(bigDiff(new int[]{7, 2, 10, 9}));
        System.out.println(bigDiff(new int[]{2, 10, 7, 2}));

    }


    public static int bigDiff(int[] nums) {
        //<VARIANT1>
        if (nums.length==1)return 0;
        int maxInd=0;
        int minInd=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]<nums[minInd]) minInd=i;
            if (nums[i]>nums[maxInd]) maxInd=i;
        }
        return (nums[maxInd]-nums[minInd]);

        //</VARIANT1>

        //<VARIANT2>
        /*if (nums.length == 1) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int tempMax = Math.max(nums[i], nums[i + 1]);
            if (max < tempMax) max = tempMax;
            int tempMin = Math.min(nums[i], nums[i + 1]);
            if (min > tempMin) min = tempMin;
        }
        return (max - min);*/

        //</VARIANT2>


    }


}
