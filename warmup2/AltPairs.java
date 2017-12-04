package warmup2;

public class AltPairs {
    /*

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
     */


    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));

    }


    public static String altPairs(String str) {
        if (str.length()<=2)return str;
        String s=str.substring(0,2);
        for (int i=4;i<str.length();i+=4){
            if (i==str.length()-1) {
                s+=str.charAt(i);
                break;
            }
            s+=str.substring(i,i+2);

        }
        return s;
    }


}
