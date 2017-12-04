package warmup1;

public class IntMax {
    /*
    Given three int values, a b c, return the largest.

    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3

     */


    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));

    }


    public static int intMax(int a, int b, int c) {
        int max = a;
        System.out.println("max a=" + max);
        /*if (b>max){
            max=b;
            System.out.println("max b="+b);
        }
        if (c>max){
            max=c;
            System.out.println("max c"+c);
        }
        return max;*/

        return (b > max && b >= c ? b : c > max && c >= b ? c : a);
    }


    /*public static String intMax2(int a, int b, int c) {
        int max = a;
        System.out.println("max a=" + max);
        *//*if (b>max){
            max=b;
            System.out.println("max b="+b);
        }
        if (c>max){
            max=c;
            System.out.println("max c"+c);
        }
        return max;*//*

        return (b > max && b >= c ? "b" : c > max && c >= b ? "c" : "a");

    }*/




}
