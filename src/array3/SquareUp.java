package array3;

import java.util.Arrays;

public class SquareUp {
    /*

Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(3)));
        System.out.println(Arrays.toString(squareUp(2)));
        System.out.println(Arrays.toString(squareUp(4)));
        System.out.println(Arrays.toString(squareUp(0)));
        System.out.println(Arrays.toString(squareUp(1)));


    }


    public static int[] squareUp(int n) {
        int[] ar = new int[n * n];
        for (int i = ar.length; i >= 1;) {
            //System.out.println("i="+i);
            int q=0;
            if (i%n==0) q = i / n;
            //System.out.println("q="+q);
            for (int j = 1; j <=n; j++) {
              //  System.out.println("j="+j);
                if (j<=q) {
                    ar[i - 1] = j;
                }else{
                    ar[i-1]=0;
                }
                i--;
            }
            //System.out.println("Массив после итерации: ");
           // System.out.println(Arrays.toString(ar));
        }

        return ar;

    }



   /* public static void fillLine(int NumsToFill, int startFrom,int n){
        for (int i=n;i)
    }*/


}
