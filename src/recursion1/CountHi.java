package recursion1;

public class CountHi {
    /*
    Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
     */


    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
        System.out.println(countHi("hihihih"));

    }


    public static int countHi(String str) {
        if (str.length()<2)return 0;
        return str.indexOf("hi")>=0?1+countHi(str.substring(str.indexOf("hi")+2)):0;
        /*
        Our Solution:

public int countHi(String str) {
  if (str.length() <= 1) return 0;
  int count = 0;
  if (str.substring(0, 2).equals("hi")) count = 1;  // could use startsWith()
  return count + countHi(str.substring(1));
}
         */


    }





    
}
