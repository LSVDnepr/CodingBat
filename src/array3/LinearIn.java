package array3;

public class LinearIn {
    /*
    Given two arrays of ints sorted in increasing order, outer and inner,
    return true if all of the numbers in inner appear in outer.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
linearIn([2, 2, 4, 4, 6, 6], [2, 4]) → true
linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 0, 3, 12]) → true
     */


    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{2, 2, 4, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 2, 4}));

    }

//не подходит, т.к. числа могут быть в outer не подряд,а разделены другими числами
   /* public static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0 && outer.length == 0) return true;
        if (inner.length == outer.length) return inner[0] == outer[0];
        if (inner.length > outer.length) return false;
        for (int i = 0, j = 0; i < outer.length && j < inner.length; i++) {
            if (outer[i] == inner[j]) {
                j++;
                continue;
            }
            if (j > 0) return false;
        }

        return true;
    }*/



    public static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) return true;
        for (int i = 0, k = 0; i < outer.length; i++) {
            if (outer[i] == inner[k]) {
                k++;
            } else {
                if (outer[i] > inner[k]) return false;
            }
            if (k == inner.length) return true;

        }

        return false;
    }


}
