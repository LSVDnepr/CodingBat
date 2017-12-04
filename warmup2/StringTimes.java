package warmup2;

public class StringTimes {
    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
     */


    public static void main(String[] args) {
        System.out.println(stringTimes("Hi",2));
        System.out.println(stringTimes("Hi",3));
        System.out.println(stringTimes("Hi",1));
        System.out.println(stringTimes("Hi",0));
        System.out.println(stringTimes("Hi",5));
    }


    public static String stringTimes(String str, int n) {

        if (n==0) return "";
        if (n==1) return str;
        String result=str;
        for (int i=1;i<n;i++){
            result+=str;
        }
        return result;

    }








}
