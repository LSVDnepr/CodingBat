package array1;

import java.util.Arrays;

public class Front11 {
    /*
    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
    If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(front11(new int[]{1,2,3},new int[]{7,8,9})));
        System.out.println(Arrays.toString(front11(new int[]{1},new int[]{2})));
        System.out.println(Arrays.toString(front11(new int[]{1,7},new int[]{})));
        System.out.println(Arrays.toString(front11(new int[]{},new int[]{7})));

    }

    public static int[] front11(int[] a, int[] b) {
        if (a.length==0&&b.length==0)return new int[]{};
        if (a.length>0){
            return (b.length>0?(new int[]{a[0],b[0]}):new int[]{a[0]});
        }
        return new int[]{b[0]};
    }

}
