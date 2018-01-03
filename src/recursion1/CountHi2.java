package recursion1;

public class CountHi2 {
    /*

Given a string, compute recursively the number of times lowercase "hi" appears in the string,
however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
     */
    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));


    }

    public static int countHi2(String str) {
        if (str.length()<2)return 0;
        int hiInd=str.indexOf("hi");
        if (hiInd==-1)return 0;
        if (hiInd==0)return 1+countHi2(str.substring(2));
        return str.charAt(hiInd-1)=='x'?countHi2(str.substring(hiInd+2)):1+countHi2(str.substring(hiInd+2));

    }







}
