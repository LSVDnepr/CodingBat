package warmup1;

public class In3050 {

    /*
    Given 2 int values, return true if they are both in the range 30..40 inclusive
    or they are both in the range 40..50 inclusive.
    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
     */

    public static void main(String[] args) {
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));




    }

    public static boolean in3050(int a, int b) {
        //<VARIANT1>
        /*if ((a<30||a>50)||(b<30||b>50)) return false;
        if (a<=40&&b<=40)return true;
        if (a>=40&&b>=40)return true;
        return false;*/

        //</VARIANT1>
        if ((a<30||a>50)||(b<30||b>50)) return false;
        return (a<=40&&b<=40?true:(a>=40&&b>=40)?true:false);

    }


}
