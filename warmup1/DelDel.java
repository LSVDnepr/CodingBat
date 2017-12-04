package warmup1;

public class DelDel {
    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));

    }

    public static String delDel(String str) {
        if (str.indexOf("del")!=1)return str;
        return str.charAt(0)+str.substring(1+"del".length(),str.length());
    }


}
