package warmup2;

public class Array123 {
    /*

Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
     */


    public static void main(String[] args) {
        /*System.out.println(array123(new int[]{1,1,2,3,1}));
        System.out.println(array123(new int[]{1,1,2,4,1}));
        System.out.println(array123(new int[]{1,1,2,1,2,3}));
        System.out.println(array123(new int[]{1,2,3}));*/
        System.out.println(array123Second(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123Second(new int[]{1, 1, 2, 4, 1}));
        System.out.println(array123Second(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(array123Second(new int[]{1, 2, 3}));

    }




    public static boolean array123(int[] nums) {
        int required = 1;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] == required) && (nums[i + 1] == required + 1) && (nums[i + 2] == required + 2)) return true;
        }

        return false;
    }



    public static boolean array123Second(int[] nums) {
        int sequenceMaxV = 3;
        int requiredNum = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == requiredNum) {
                requiredNum++;
                if (requiredNum > sequenceMaxV) break;
            } else {
                requiredNum = 1;
                if (nums[i] == requiredNum) {
                    requiredNum++;
                }
            }
        }
        return (requiredNum <= sequenceMaxV ? false : true);
    }


}
