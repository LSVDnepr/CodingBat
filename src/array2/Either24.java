package array2;

public class Either24 {
    /*
    Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
     */

    public static void main(String[] args) {
        System.out.println(either24(new int[]{1, 2, 2}));
        System.out.println(either24(new int[]{4, 4, 1}));
        System.out.println(either24(new int[]{4, 4, 1, 2, 2}));
        System.out.println(either24(new int[]{4, 3, 2, 1}));

    }


    public static boolean either24(int[] nums) {
        boolean found2 = false;
        boolean found4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                if (found4) return false;
                found2 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                if (found2) return false;
                found4 = true;
            }
        }
        return ((found2) || (found4));

    }


}
