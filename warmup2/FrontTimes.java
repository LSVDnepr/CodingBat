package warmup2;

public class FrontTimes {
    /*
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("Abc", 0));

    }

    public static String frontTimes(String str, int n) {
       /* if (n == 0) return "";
        //если длина строки меньше 3 или равна 3 символам
        if (str.length() <= 3) {
            String s = str;
            for (int i = 1; i < n; i++) {
                s += str;
            }
            return s;
        } else {//если длина строки больше 3
            String s = str.substring(0, 3);
            for (int i = 1; i < n; i++) {
                s += str.substring(0, 3);
            }
            return s;
        }*/

        if (n == 0) return "";
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        String s = str;
        for (int i = 1; i < n; i++) {
            s += str;
        }
        return s;


    }


}
