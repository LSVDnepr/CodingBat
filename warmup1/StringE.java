package warmup1;

public class StringE {
    /*
    Return true if the given string contains between 1 and 3 'e' chars.


    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
        System.out.println(stringE("Hi"));
    }


    public static boolean stringE(String str) {
        if (str.isEmpty())return false;
        int eCalc=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='e'||str.charAt(i)==('E'))eCalc++;
        }
        return (eCalc>=1&&eCalc<=3?true:false);

    }


}
