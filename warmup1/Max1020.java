package warmup1;

public class Max1020 {
    /*
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    or return 0 if neither is in that range.

    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
     */

    public static void main(String[] args) {
        System.out.println(max1020(11,19));
        System.out.println(max1020(19,11));
        System.out.println(max1020(11,9));
        System.out.println(max1020(8,5));
        System.out.println(max1020(24,32));
        System.out.println(max1020(11,21));
        System.out.println(max1020(25,19));
        System.out.println(max1020(9,21));


    }


    public static int max1020(int a, int b) {
       //<VARIANT 1>
        /* if ((a<10&&b<10)||((a>20&&b>20)))return 0;

        if (a>b){
            return ((a>=10&&a<=20)?a:(b>=10&&b<=20)?b:0);
        }else{
            return ((b>=10&&b<=20)?b:(a>=10&&a<=20)?a:0);
        }*/
       //</VARIANT 1>
       //<VARIANT 2>
        System.out.println("a="+a);
        System.out.println("b="+b);
        boolean isA1020=((a>=10&&a<=20)?true:false);
        boolean isB1020=((b>=10&&b<=20)?true:false);
        if (!isA1020&&!isB1020){
            System.out.println("Оба переданных числа находятся вне диапазона");
            return 0;
        }
        if (a>=b){
            return (isA1020?a:b);
        }else{
            return (isB1020?b:a);
        }

        //</VARIANT 2>

    }


}
