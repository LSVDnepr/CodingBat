package warmup1;

public class StartOz {
    /*
    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z',
    so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"


     */

    public static void main(String[] args) {

        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
        System.out.println(startOz("mozart"));

    }



    public static String startOz(String str) {
        if (str.isEmpty())return str;
        String ozStr="";
        if (str.charAt(0)=='o'||str.charAt(0)=='O'){
            ozStr+=str.charAt(0);
        }
        if (str.length()==1)return ozStr;
        if (str.charAt(1)=='z'||str.charAt(0)=='Z'){
            ozStr+=str.charAt(1);
        }
        return ozStr;

    }

}
