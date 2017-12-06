package logic1;

public class Love6 {
    /*

The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
Or if their sum or difference is 6.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
     */

    public static void main(String[] args) {
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));



    }

    public static boolean love6(int a, int b) {
        return ((a==6)||(b==6)||(Math.abs(a-b)==6)||(a+b==6));




    }






}
