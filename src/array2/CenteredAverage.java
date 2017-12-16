package array2;

public class CenteredAverage {
    /*

Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.
Use 1 loop


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */

    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
        System.out.println(centeredAverage(new int[]{5,5,5,5,5,5,5}));


    }


    public static int centeredAverage(int[] nums) {
        //<VARIANT 1> SOLUTION IN ONE LOOP
        int minInd = (nums[0]<=nums[1]?0:1);
        int maxInd = (nums[0]>=nums[1]?0:1);
        int sum = 0;
        for (int i = 2; i < nums.length; i++) {
            if ((nums[minInd] < nums[i]) && (nums[maxInd] > nums[i])) {
                sum += nums[i];
                continue;
            }
            if (nums[i] <= nums[minInd]) {
                sum += nums[minInd];
                minInd = i;
            }

            if ((nums[i] >= nums[maxInd])&&(nums[i]!=nums[minInd])) {
                sum += nums[maxInd];
                maxInd = i;
            }
        }
        return sum / (nums.length - 2);
        //</VARIANT 1>

        //<VARIANT 2> NOT 1 LOOP SOLUTION BUT MUCH MORE READABLE;
     /*   int minInd=0;
        int maxInd=0;
        int sum=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]<nums[minInd]) minInd=i;
            if (nums[i]>nums[maxInd]) maxInd=i;
        }
        if (maxInd==minInd) maxInd=minInd+1;
        for (int i=0;i<nums.length;i++){
            if (i!=minInd&&i!=maxInd){
                sum+=nums[i];
            }
        }
        return sum/(nums.length-2);*/

        //</VARIANT 2>


    }


}
