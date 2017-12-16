package string2;

public class SameStarChar {
    /*
    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
     */

    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
    }


    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length()-1; i++) {
           if (str.charAt(i)!='*')continue;
           if (str.charAt(i-1)!=str.charAt(i+1))return false;
        }
        return true;
    }



    //<VARIANT2>
    /*public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length()-1; i++) {
            int starInd = str.indexOf('*', i);
            if (starInd == -1) break;
            if (str.charAt(starInd - 1) != str.charAt(starInd + 1)) return false;
            i = starInd + 1;
        }

        return true;
    }*/
    //</VARIANT2>





}
