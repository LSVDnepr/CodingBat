package array2;

public class HaveThree {
    /*
    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

    haveThree([3, 1, 3, 1, 3]) → true
    haveThree([3, 1, 3, 3]) → false
    haveThree([3, 4, 3, 3, 4]) → false
     */

    public static void main(String[] args) {
        System.out.println(haveThree(new int[]{3,1,3,1,3}));
        System.out.println(haveThree(new int[]{3,1,3,3}));
        System.out.println(haveThree(new int[]{3,4,3,3,4}));

    }

    public static boolean haveThree(int[] nums) {
        int calc=0;
        int prev3ind=-1;
        if (nums.length<3) return false;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=3)continue;
            if (prev3ind!=-1&&prev3ind==i-1)return false;
            prev3ind=i;
            calc++;
        }

        return (calc==3);
    }


}
