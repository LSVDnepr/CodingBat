package warmup2;

public class DoubleX {
    /*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
     */


    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("xaxxxx"));

    }



    public static boolean doubleX(String str) {
        if ((str.length() <= 1) || (str.indexOf("xx") == -1)) return false;
        return (str.charAt(str.indexOf('x') + 1) == 'x' ? true : false);

        //int ind = str.indexOf('x');
            //return (str.charAt(ind + 1) == 'x' ? true : false);
    }






}
