package recursion1;

public class Count8 {
    /*

Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count8(8) → 1
count8(818) → 2
count8(8818) → 4
count8(88888) → 9
     */

    public static void main(String[] args) {
        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(8818));
        System.out.println(count8(88888));

    }


    public static int count8(int n) {
        if (n<0)throw new IllegalArgumentException("Illegal value n="+n);
        if (n<10)return n==8?1:0;
        return n%10==8?((n/10%10==8?2:1)+count8(n/10)):(count8(n/10));



    }




}
