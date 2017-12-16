package logic2;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MakeChocolate {
    /*
    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars.
    Return -1 if it can't be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
     */

    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));//4
        System.out.println(makeChocolate(4, 1, 10));//-1
        System.out.println(makeChocolate(4, 1, 7));//2
        System.out.println(makeChocolate(8, 2, 18));//8
        System.out.println(makeChocolate(8, 3, 15));//0
        System.out.println(makeChocolate(1, 2, 6));//1
        System.out.println(makeChocolate(1, 2, 7));//-1
        System.out.println(makeChocolate(1, 2, 5));//0
        System.out.println(makeChocolate(6, 2, 7));//2

    }


    public static int makeChocolate(int small, int big, int goal) {
        //если в принципе не достижимо
        if (big * 5 + small < goal) return -1;
        //если не понадобится использовать маленькие плитки
        if ((goal % 5 == 0) && (goal / 5 <= big)) return 0;
        //остальное
        int bigNeeded=(goal/5<=big?goal/5:big);
        int smallNeeded = (goal - bigNeeded * 5);
        return (smallNeeded > small ? -1 : smallNeeded);

    }


}
