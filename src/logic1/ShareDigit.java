package logic1;

public class ShareDigit {
    /*
    Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
    such as the 2 in 12 and 23.


shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
     */

    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));


    }


    public static boolean shareDigit(int a, int b) {
        if (a<10||b<10||a>99||b>99) throw new IllegalArgumentException("Numbers must be in 10...99 range");
        //a%10 - последняя цифра числа a
        //a/10 - первая цифра числа a
        //b%10 - последняя цифра числа b
        //b/10 - первая цифра числа b

        return ((a%10==b%10)||(a%10==b/10)||(a/10==b%10)||(a/10==b/10));

    }





}
