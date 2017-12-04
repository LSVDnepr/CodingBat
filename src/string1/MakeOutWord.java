package string1;

public class MakeOutWord {
    /*

Given an "out" string length 4, such as "<<>>", and a word,
return a new string where the word is in the middle of the out string, e.g. "<<word>>".

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
     */

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));


    }

    public static String makeOutWord(String out, String word) {
        return (out.substring(0,out.length()/2)+word+out.substring(out.length()/2,out.length()));

    }



}
