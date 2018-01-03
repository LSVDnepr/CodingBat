package recursion1;

public class NestParen {
    /*

Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
Suggestion: check the first and last chars, and then recur on what's inside them.


nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
     */

    public static void main(String[] args) {
        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
        System.out.println(nestParen(""));
        System.out.println(nestParen("2a"));
        System.out.println(nestParen("x"));


    }


    public static boolean nestParen(String str) {
       if (str.length()==0)return true;
        if(str.length()%2!=0)return false;
        if ((str.charAt(0)!='(')||str.charAt(str.length()-1)!=')')return false;
        return nestParen(str.substring(1,str.length()-1));

    }

}
