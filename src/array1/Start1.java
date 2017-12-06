package array1;

public class Start1 {
    /*
    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1

     */


    public static void main(String[] args) {
        System.out.println(start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        System.out.println(start1(new int[]{7, 2, 3}, new int[]{1}));
        System.out.println(start1(new int[]{1, 2}, new int[]{}));
        System.out.println(start1(new int[]{7}, new int[]{}));

    }


    public static int start1(int[] a, int[] b) {
        if ((a.length == 0) && (b.length == 0)) return 0;
        if (a.length != 0 && a[0] == 1) {
            return (b.length != 0 && b[0] == 1) ? 2 : 1;
        }
        return (b.length != 0 && b[0] == 1) ? 1 : 0;

    }


}
