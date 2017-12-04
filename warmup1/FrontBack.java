package warmup1;

public class FrontBack {
    /*
    Given a string, return a new string where the first and last chars have been exchanged.
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */


    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack(""));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));


    }


    public static String frontBack(String str) {

        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);


       //<VARIANT 2>
       /* if (str.length()<=1) return str;
        char[] strAr=str.toCharArray();
        char temp=strAr[0];
        strAr[0]=strAr[strAr.length-1];
        strAr[strAr.length-1]=temp;
        return new String(strAr);
        */

        //</VARIANT 2>

        /*System.out.println("Исходная строка: "+str);
        char chFirst=str.charAt(0);
        char chLast=str.charAt(str.length()-1);
        System.out.println("chFisrt="+chFirst);
        System.out.println("chLast="+chLast);
        //str=str.replace(str.charAt(0),chLast).replace(str.charAt(str.length()-1),chFirst);
        str=str.replace(str.charAt(0),chLast);
        System.out.println(str);
        str=str.replace(str.charAt(str.length()-1),chFirst);
        System.out.println(str);*/
        //str=str.replace(str.charAt(str.length()-1),ch);

        /*char ch = str.charAt(0);
        System.out.println("сохраняю во временную переменную символ: " + ch);

        System.out.println("ставлю на место " + str.charAt(0) + " символ " + str.charAt(str.length() - 1));
        str = str.replace(str.charAt(0), str.charAt(str.length() - 1));
        System.out.println("строка после замены нулевого символа: " + str);
        System.out.println("Помещаю на место последнего символа " + str.charAt(str.length() - 1) + " сохраненный во временную переменную " + ch);
        System.out.println("ch=" + ch);
        //str = str.replace(str.charAt(str.length() - 1), ch);
        str=str.replace(str.charAt(str.length()-1),'c');
        System.out.println("строка после замены последнего символа : " + str);
       *//*str=str.replace(str.charAt(0),str.charAt(str.length()-1)).replace(str.charAt(str.length()-1),ch);
        System.out.println(str);*//*
        return str;*/
    }

}
