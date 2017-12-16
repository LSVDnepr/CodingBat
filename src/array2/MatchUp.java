package array2;

public class MatchUp {
    /*
    Given arrays nums1 and nums2 of the same length, for every element in nums1,
    consider the corresponding element in nums2 (at the same index).
    Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
     */

    public static void main(String[] args) {
        System.out.println(matchUp(new int[]{1,2,3}, new int[]{2,3,10}));
        System.out.println(matchUp(new int[]{1,2,3}, new int[]{2,3,5}));
        System.out.println(matchUp(new int[]{1,2,3}, new int[]{2,3,3}));


    }

    public static int matchUp(int[] nums1, int[] nums2) {
        if (nums1.length!=nums2.length) throw new IllegalArgumentException("Arrays must be the same length");
        int calc=0;
        for (int i=0;i<nums1.length;i++){
            if ((Math.abs(nums1[i]-nums2[i])>2)||(nums1[i]==nums2[i]))continue;
            calc++;
        }
        return calc;

    }



}