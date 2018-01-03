package recursion1;

public class CountAbc {
    /*

Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
countAbc("abxbc") → 0

     */


    public static void main(String[] args) {
        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));
        System.out.println(countAbc("ababc"));
        System.out.println(countAbc("abxbc"));

    }

    public static int countAbc(String str) {
        if (str.length()<3)return 0;
        int indAb=str.indexOf("ab");
        if (indAb==-1)return 0;
        return (str.charAt(indAb+2)=='a'||str.charAt(indAb+2)=='c')?1+countAbc(str.substring(indAb+2)):countAbc(str.substring(indAb+1));


    }



}
