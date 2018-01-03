package recursion1;

public class ChangePi {
    /*

Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
     */

    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
        System.out.println(changePi("pipi"));
        System.out.println(changePi("pip"));


    }


    public static String changePi(String str) {
        if (str.length()<=1)return str;
       /* if (str.indexOf("pi")==-1)return str;
        return str.substring(0,str.indexOf("pi"))+"3.14"+changePi(str.substring(str.indexOf("pi")+2));*/
       int piInd=str.indexOf("pi");
        if (piInd==-1)return str;
        return str.substring(0,piInd)+"3.14"+changePi(str.substring(piInd+2));

    }





}
