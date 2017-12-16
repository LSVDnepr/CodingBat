package array2;

public class Has77 {
    /*
    Given an array of ints, return true if the array contains two 7's next to each other,
    or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
     */

    public static void main(String[] args) {
        System.out.println(has77(new int[]{1, 7, 7}));
        System.out.println(has77(new int[]{1, 7, 1, 7}));
        System.out.println(has77(new int[]{1, 7, 1, 1, 7}));


    }


    public static boolean has77(int[] nums) {

        if (nums.length < 2) return false;
        int indOf7 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 7) continue;
            if (indOf7 != -1) {
                if (i - indOf7 <= 2) return true;
            }
            indOf7 = i;
        }

        return false;
    }

}
