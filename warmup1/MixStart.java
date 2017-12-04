package warmup1;

public class MixStart {
    /*
    Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
     */


    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));

    }


    public static boolean mixStart(String str) {
        //<VARIANT 1>
        if (str.indexOf("ix")==1)return true;
        return false;
        //</VARIANT1>


        //<VARIANT2>
        /*if (str.startsWith(([A-Za-z0-9][i][x]))return true;
        return false;*/

        //</VARIANT2>


    }

}
