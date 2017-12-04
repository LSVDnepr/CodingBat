package warmup2;

public class StringYak {
    /*
    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
    but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
     */


    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));


    }

    public static String stringYak(String str) {
        if (str.length()<=2)return str;
        return str.replace("yak","");


    }


}
