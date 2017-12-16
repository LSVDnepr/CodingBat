package logic2;

public class BlackJack {
    /*

Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
     */


    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));

    }

    public static int blackjack(int a, int b) {
        if (a>21&&b>21)return 0;
        //<VARIANT 1>
       /* if (a>21)return b;
        if (b>21) return a;
        if (Math.abs(21-a)<=Math.abs(21-b)){
            return a;
        }
        return b;*/
       //</VARIANT1>

        //<VARIANT2>
       //return (a>21?b:(b>21)?a:(Math.abs(21-a)<=Math.abs(21-b)?a:b));
       //</VARIANT2>

        //<VARIANT3>
       /*if (a>21)a=0;
       if (b>21) b=0;
       return (Math.max(a,b));*/
        //</VARIANT3>

        //<VARIANT4>
        return (a>21?b:b>21?a:Math.max(a,b));
       //</VARIANT 4>


    }






}
