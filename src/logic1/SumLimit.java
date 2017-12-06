package logic1;

public class SumLimit {
    /*

Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b.

sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
     */

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));

    }


    public static int sumLimit(int a, int b) {
        return ((String.valueOf(a+b).length()>String.valueOf(a).length())?a:a+b);

    }



}
