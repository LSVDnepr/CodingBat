package string2;

public class CountCode {
    /*
    Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
        System.out.println(countCode("cozexxzoco"));
        System.out.println(countCode("core"));
        System.out.println(countCode("cocozexxzoco"));


    }

    public static int countCode(String str) {
        if (str.length() < 4) return 0;
        int calc = 0;
        for (int i = 0; i < str.length(); ) {
            int ind = str.indexOf("co", i);
            if (ind == -1) break;
            if ((ind + 3) < str.length() && (str.charAt(ind + 3) == 'e')) {
                calc++;
                i = ind + 3;
            } else {
                i = ind + 1;
            }
        }
        return calc;


    }


}
