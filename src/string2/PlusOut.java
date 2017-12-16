package string2;

public class PlusOut {
    /*
    Given a string and a non-empty word string, return a version of the original String
    where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     */


    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));

    }

    public static String plusOut(String str, String word) {
        String result = "";
        if (str.indexOf(word) == -1) {
            for (int i = 0; i < str.length(); i++) {
                result += '+';
            }
            return result;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i != str.indexOf(word,i)){
                result += '+';
            }else{
                result+=word;
                i+=word.length()-1;
            }
        }
        return result;

    }


}
