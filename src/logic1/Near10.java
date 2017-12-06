package logic1;

public class Near10 {
    /*
    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
     */

    public static void main(String[] args) {
        System.out.println(nearTen(12));//true
        System.out.println(nearTen(17));//false
        System.out.println(nearTen(19));//true
        System.out.println(nearTen(22));//true
        System.out.println(nearTen(23));//false
        System.out.println(nearTen(3));//false


    }


    public static boolean nearTen(int num) {
        if (num<0)  throw new IllegalArgumentException("Number must be non-negative");
        return  (num%10==0||(num+1)%10==0||(num+2)%10==0||(num-1)%10==0||(num-2)%10==0);



    }




}
