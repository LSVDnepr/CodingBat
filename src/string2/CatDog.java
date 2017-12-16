package string2;

public class CatDog {
    /*

Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
     */

    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
        System.out.println(catDog("movieticket12345"));
        System.out.println(catDog("catdogdogcat"));

        //если оба индекса !=-1, то надо смотреть, что ближе.
        //если же только индекс кота =-1,  то смотреть индекс собаки
        //если же только индекс собаки =-1,  то смотреть индекс кота


    }


    /*public static boolean catDog(String str) {//работает, но, по-моему, не оптимально
        if (str.length() < 3) return true;
        if (str.indexOf("cat") == -1 && str.indexOf("dog") == -1) return true;
        int catCalc = 0;
        int dogCalc = 0;

        for (int i = 0; i < str.length(); ) {
            int catInd = str.indexOf("cat", i);
            int dogInd = str.indexOf("dog", i);
            if ((catInd != -1) && (dogInd != -1)) {
                if (catInd < dogInd) {
                    catCalc++;
                    i = catInd + "cat".length();
                } else {
                    dogCalc++;
                    i = dogInd + "dog".length();
                }
                continue;
            }
            if (catInd == -1) {
                dogCalc++;
                i = dogInd + "dog".length();
            } else {
                catCalc++;
                i = catInd + "cat".length();
            }
            if (catInd == -1 && dogInd == -1) break;
        }
        return catCalc == dogCalc;

    }*/


    public static boolean catDog(String str) {
        if (str.length() < 3) return true;
        if (str.indexOf("cat") == -1 && str.indexOf("dog") == -1) return true;
        int calc = 0;

        for (int i = 0; i < str.length(); ) {
            int catInd = str.indexOf("cat", i);
            int dogInd = str.indexOf("dog", i);
            if ((catInd != -1) && (dogInd != -1)) {
                calc = (catInd < dogInd) ? (calc+=1) : (calc-=1);
                i = (catInd < dogInd ? catInd + 3 : dogInd + 3);
                continue;
            }

            if (catInd == -1) {
                calc--;
                i = dogInd + 3;
            } else {
                calc++;
                i = catInd + 3;
            }
            if (catInd == -1 && dogInd == -1) break;
        }

        return calc == 0;

    }


}
