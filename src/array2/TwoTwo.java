package array2;

public class TwoTwo {
    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
     */

    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{4, 2, 2, 3}));
        System.out.println(twoTwo(new int[]{2, 2, 4}));
        System.out.println(twoTwo(new int[]{2, 2, 4, 2,}));
        System.out.println(twoTwo(new int[]{4, 2, 2, 2,}));
        System.out.println(twoTwo(new int[]{2, 2, 2,}));
        System.out.println(twoTwo(new int[]{2}));
        System.out.println(twoTwo(new int[]{}));
        System.out.println(twoTwo(new int[]{2, 2}));


    }


    public static boolean twoTwo(int[] nums) {
        if (nums.length==0) return true;
        if (nums.length==1) return (nums[0]!=2);

        //случай, когда нулевой элемент равен 2
        if ((nums[0] == 2) && (nums[1] != 2)) return false;
        //случай, когда последний элемент равен 2
        if ((nums[nums.length - 1] == 2) && (nums[nums.length - 2] != 2)) return false;
        //центральная часть массива
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != 2) continue;
            if (nums[i - 1] != 2 && nums[i + 1] != 2) return false;
        }

        return true;
    }


}
