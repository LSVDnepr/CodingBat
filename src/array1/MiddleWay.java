package array1;

import java.util.Arrays;

public class MiddleWay {
    /*
    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(middleWay(new int[]{1, 2, 3},new int[]{4,5,6})));
        System.out.println(Arrays.toString(middleWay(new int[]{7, 7, 7},new int[]{4,8,0})));
        System.out.println(Arrays.toString(middleWay(new int[]{5, 2, 9},new int[]{1,4,5})));

    }


    public static int[] middleWay(int[] a, int[] b) {
       /* int[] c=new int[2];
        c[0]=a[a.length/2];
        c[1]=b[b.length/2];
        return c;*/
       return new int[]{a[a.length/2],b[b.length/2]};

    }


}
