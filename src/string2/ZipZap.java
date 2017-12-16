package string2;

public class ZipZap {
    /*
    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp
zipZap("abcppp") → "abcppp"
zipZap("azbcppp") → "azbcppp"
zipZap("azbcpzpp") → "azbcpzp"

     */


    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
        System.out.println(zipZap("abcppp"));
        System.out.println(zipZap("azbcppp"));
        System.out.println(zipZap("azbcpzpp"));

    }




    public static String zipZap(String str) {
        if (str.length() < 3) return str;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            int zInd = str.indexOf('z', i);
            if (zInd == -1){
                s+=str.substring(i,str.length());
              // System.out.println("(-1) добавляю "+str.substring(i,str.length()));
                break;
            }
            s += (str.substring(i, zInd + 1));
          //  System.out.println("(независимо от p)добавляю "+str.substring(i, zInd + 1));
            i=zInd;
            if (str.charAt(zInd + 2) == 'p') {
                s += str.charAt(zInd + 2);
               // System.out.println("(==p) добавляю "+str.charAt(zInd + 2));
                i = zInd + 2;
            }

        }
        return s;
    }


}
