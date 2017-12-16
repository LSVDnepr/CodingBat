package string2;

public class RepeatFront {
    /*
    Given a string and an int n, return a string made of the first n characters of the string,
    followed by the first n-1 characters of the string, and so on.
    You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
     */

    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));


    }

    public static String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length());
        while (n > 0) {
            sb.append(str.substring(0, n));
            n--;
        }
        return sb.toString();

    }


}
