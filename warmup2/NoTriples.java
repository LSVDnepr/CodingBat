package warmup2;

public class NoTriples {
    /*

Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */


    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }


    public static boolean noTriples(int[] nums) {
        if (nums.length <= 2) return true;
        for (int i = 0; i < nums.length - 2; i++) {
            int numToCheck = nums[i];
            if ((nums[i + 1] == numToCheck && nums[i + 2] == numToCheck)) return false;
        }
        return true;

    }



}

