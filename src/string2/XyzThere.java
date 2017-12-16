package string2;

public class XyzThere {
    /*
    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
    So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
     */

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
        System.out.println(xyzThere("abc.xyzxyz"));


    }


    public static boolean xyzThere(String str) {
        if (str.length()<3)return false;
        int ind=str.indexOf("xyz");
        if (ind==-1)return false;
        if (ind==0)return true;
        for (int i=1;i<str.length();){
           // System.out.println("i="+i);
            ind=str.indexOf("xyz",i);
           // System.out.println("ind="+ind);
            if (ind==-1)break;
            if (str.charAt(ind-1)!='.'){
              //  System.out.println("char before xyz="+str.charAt(ind-1));
                return true;
            }
            i=ind+2;
        }
        return  false;

    }





}
