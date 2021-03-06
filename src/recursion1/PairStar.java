package recursion1;

public class PairStar {
    /*
    Given a string, compute recursively a new string where identical chars
    that are adjacent in the original string are separated from each other by a "*".

pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
     */

    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
        System.out.println(pairStar("xxyy"));
        System.out.println(pairStar("aaaa"));

    }


    public static String pairStar(String str) {
        if (str.length()<2)return str;
        return (str.charAt(0)==str.charAt(1)?str.charAt(0)+"*"+pairStar(str.substring(1)):str.charAt(0)+pairStar(str.substring(1)));

    }


}
