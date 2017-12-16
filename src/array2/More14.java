package array2;

public class More14 {
    /*
    Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
     */


    public static void main(String[] args) {
        System.out.println(more14(new int[]{1, 4, 1}));
        System.out.println(more14(new int[]{1, 4, 1, 4}));
        System.out.println(more14(new int[]{1, 1}));

    }


    public static boolean more14(int[] nums) {
        int calcOf1 = 0;
        int calcOf4 = 0;
        for (int i : nums) {
            if (i == 1) calcOf1++;
            if (i == 4) calcOf4++;
        }
        return (calcOf1 > calcOf4);

    }

}
