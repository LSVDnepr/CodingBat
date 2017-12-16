package array2;

public class CountEvens {
    /*

Return the number of even ints in the given array.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
     */


    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));

    }


    public static int countEvens(int[] nums) {
        int evenCalc = 0;
        for (int i : nums) {
            if (i % 2 == 0) evenCalc++;
        }
        return evenCalc;

    }


}
