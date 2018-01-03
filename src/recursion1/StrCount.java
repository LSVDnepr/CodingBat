package recursion1;

public class StrCount {
    /*
    Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
    without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
     */

    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));


    }


    public static int strCount(String str, String sub) {
        if (sub.length()==0)throw new IllegalArgumentException("Sub string cannot be empty!");
        if (str.length()<sub.length())return 0;
        int subInd=str.indexOf(sub);
        if (subInd==-1)return 0;
        return 1+strCount(str.substring(subInd+sub.length()),sub);



    }

}
