package array2;

public class ModThree {
    /*
    Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true

     */

    public static void main(String[] args) {
        System.out.println(modThree(new int[]{2, 1, 3, 5}));
        System.out.println(modThree(new int[]{2, 1, 2, 5}));
        System.out.println(modThree(new int[]{2, 4, 2, 5}));

    }

    public static boolean modThree(int[] nums) {
        if (nums.length < 3) return false;
        int oddsCalc = 0;
        int evenCalc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCalc++;
                oddsCalc = 0;
            } else {
                oddsCalc++;
                evenCalc = 0;
            }
            if (evenCalc == 3 || oddsCalc == 3) return true;
        }
        return false;

    }


}
