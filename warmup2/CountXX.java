package warmup2;

public class CountXX {
    /*
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
     */


    public static void main(String[] args) {

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
        System.out.println(countXX("abcdexmn"));


    }


    public static int countXX(String str) {
        if ((str.length() <= 1)||(str.indexOf("xx") == -1)) return 0;
        int xxCalc = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf("xx",i)==-1)break;
            xxCalc++;
            i=str.indexOf("xx",i);
        }
        return xxCalc;
    }


}
