package string2;

public class WordEnds {
    /*
    Given a string and a non-empty word string,
    return a string made of each char just before and just after every appearance of the word in the string.
    Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
wordEnds("XYXY", "XY") → "XY"
wordEnds("abc1xyz11", "1") → "cxz11"
wordEnds("abc1xyz1abc", "b") → "acac"
     */

    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
        System.out.println(wordEnds("aXYXYb", "XY"));
        System.out.println(wordEnds("XY", "XY"));
        System.out.println(wordEnds("XYXY", "XY"));
        System.out.println(wordEnds("abc1xyz11", "1"));
        System.out.println(wordEnds("abc1xyz1abc", "b"));

    }

    public static String wordEnds(String str, String word) {
        if (str.length() < word.length()) return "";
        if (str.indexOf(word) == -1) return "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int wordInd = str.indexOf(word, i);
            if (wordInd == -1) break;

            //слово сразу в начале строки и нет символа после слова
            if ((wordInd == 0) && (wordInd + word.length() == str.length())) {
                //System.out.println("в этой строке находится только выбранное слово!");
                return "";
            }

            //слово сразу в начале строки, есть символ после слова
            if (wordInd == 0) {
               // System.out.println("эта строка начинается с выбранного слова");
                result += str.charAt(wordInd + word.length());
                i = wordInd + word.length()-1;
                continue;
            }

            //строка заканчивается на выбранное слово, есть символ до слова
            if (wordInd + word.length() == str.length()) {
              //  System.out.println("эта строка заканчивается выбранным словом");
                result += str.charAt(wordInd - 1);
                i = wordInd + word.length();
                continue;
            }

            //слово посередине
            result = result + str.charAt(wordInd - 1) + str.charAt(wordInd + word.length());
            i = wordInd + word.length()-1;
        }

        return result;
    }

}
