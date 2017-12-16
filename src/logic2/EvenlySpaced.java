package logic2;

public class EvenlySpaced {
    /*
Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small and medium is the same as
the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
     */

    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
        System.out.println(evenlySpaced(4, 4, 8));
        System.out.println(evenlySpaced(5, 5, 5));

    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if (a==b&&b==c)return true;
        if (a == b || b == c || a == c) return false;
        int min = (a <= b && a <= c ? a : (b <= a && b <= c) ? b : c);
        int max = (a >= b && a >= c ? a : (b >= a && b >= c) ? b : c);
        int med = (a != min && a != max ? a : (b != min && b != max) ? b : c);

        return (Math.abs(min - med) == Math.abs(med - max));

    }


}
