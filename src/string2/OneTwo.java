package string2;

public class OneTwo {
    /*

Given a string, compute a new string by moving the first char to come after the next two chars,
so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
     */

    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
        System.out.println(oneTwo("cabde"));


    }


   /* public static String oneTwo(String str) {
        String s="";
        if (str.length()<3)return str;
        for (int i=0;i<str.length();i+=3){
            s=str.substring(i+1,i+3)+(str.charAt(i));
        }
        return s;

    }*/


    //<VARIANT1>
   /* public static String oneTwo(String str) {
   if (str.length()<3)return "";
        String s="";
        for (int i=0;i<str.length()-2;i++){
            if (i%3==0){
                s+=str.substring(i+1,i+3)+str.charAt(i);
            }
        }
       // s+=str.substring(s.length(),str.length());
        return s;

    }*/
    //</VARIANT1>

    //<VARIANT2>
    public static String oneTwo(String str) {
        if (str.length() < 3) return "";
        String s = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            s += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        //s += str.substring(s.length(), str.length());

        return s;

    }

    //</VARIANT2>


}
