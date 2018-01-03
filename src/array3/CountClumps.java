package array3;

public class CountClumps {
    /*

Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
Return the number of clumps in the given array.


countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
     */


    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));



    }



    public static int countClumps(int[] nums) {
        if (nums.length<=1)return 0;
        int calc=0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                calc++;
               // System.out.println("nums[i]=nums["+i+"]="+nums[i]);
                //System.out.println("nums[i+1]=nums["+(i+1)+"]="+nums[i+1]);
                while (i<nums.length-1&&(nums[i]==nums[i+1])){
                    i++;
                }
            }
        }
        return calc;
    }


}
