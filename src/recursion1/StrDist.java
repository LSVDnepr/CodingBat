package recursion1;

public class StrDist {
    /*

Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
strDist("cccatcowcatxxcatcatffcat", "cat") → 22
     */

    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
        System.out.println(strDist("cccatcowcatxxcatcatffcat", "cat"));


    }


    /*public static int strDist(String str, String sub){
        if (str.length()<sub.length())return 0;
        if (str.indexOf(sub)==-1)return 0;
        if (str.lastIndexOf(sub)==str.indexOf(sub))return sub.length();
        return str.substring(str.indexOf(sub),str.lastIndexOf(sub)+sub.length()).length();


    }*/

    //если решать рекурсией, как требуется по условию, то получаем менее эффективное решение:
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.indexOf(sub) == -1) return 0;
        int strLen=str.length();
        if (str.startsWith(sub)) {
            return str.endsWith(sub)?strLen:strDist(str.substring(0, strLen - 1), sub);
        } else {
            return (str.endsWith(sub)?strDist(str.substring(1), sub):strDist(str.substring(1, strLen - 1), sub));
        }

    }

/*

    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.indexOf(sub) == -1) return 0;
        if (str.startsWith(sub)) {
            if (str.endsWith(sub)) {
                return str.length();
            } else {
                return strDist(str.substring(0, str.length() - 1), sub);
            }
        } else {
            if (str.endsWith(sub)) {
                return strDist(str.substring(1), sub);
            } else {
                return strDist(str.substring(1, str.length() - 1), sub);
            }
        }
    }
*/

}
