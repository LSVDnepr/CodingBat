package recursion1;

public class ParentBit {
    /*

Given a string that contains a single pair of parenthesis,
compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
     */

    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));


    }


    public static String parenBit(String str) {
        /*if (str.length()==0)return str;
        if ((str.indexOf('(')==-1)||(str.indexOf(')')==-1))return "";
        return str.substring(str.indexOf('('),str.indexOf(')')+1);*/
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }
        if (str.charAt(str.length()-1) != ')') {
            return parenBit(str.substring(0, str.length()-1));
        }
        return str;

    }


}
