package array3;

import java.util.Arrays;

public class SeriesUp {
    /*
    Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
    (spaces added to show the grouping).
    Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3)));
        System.out.println(Arrays.toString(seriesUp(4)));
        System.out.println(Arrays.toString(seriesUp(2)));
        System.out.println(Arrays.toString(seriesUp(0)));
        System.out.println(Arrays.toString(seriesUp(1)));


    }


    public static int[] seriesUp(int n) {
        int[] ar = new int[n * (n + 1) / 2];
        int q = 1;
        for (int i = 0; i < ar.length; ) {
            for (int j = 1; j <= q; j++) {
                //System.out.println("q="+q);
                //System.out.println("j="+j);
                ar[i] = j;
                //System.out.println("ar["+i+"]="+ar[i]);
                i++;
            }
            q++;
        }

        return ar;
    }

}
