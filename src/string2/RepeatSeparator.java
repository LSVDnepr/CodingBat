package string2;

public class RepeatSeparator {
    /*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
     */

    public static void main(String[] args) {
        System.out.println(repeatSeparator2("Word", "X", 3));
        System.out.println(repeatSeparator2("This", "And", 2));
        System.out.println(repeatSeparator2("This", "And", 1));
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
        System.out.println(repeatSeparator("AAA", "", 0));


    }


    public static String repeatSeparator(String word, String sep, int count) {
        if (count==0)return "";
        StringBuilder sb=new StringBuilder(word);
        for (int i=0;i<count-1;i++){
            sb.append(sep).append(word);
        }
        return sb.toString();


    }


    public static String repeatSeparator2(String word, String sep, int count) {
        if (count==0)return "";
       String s=word;
        for (int i=0;i<count-1;i++){
            s=s.concat(sep).concat(word);
        }
        return s;

    }





}
