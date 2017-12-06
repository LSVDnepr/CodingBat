package logic1;

public class FizzString {
    /*
    Given a string str, if the string starts with "f" return "Fizz".
    If the string ends with "b" return "Buzz".
    If both the "f" and "b" conditions are true, return "FizzBuzz".
    In all other cases, return the string unchanged.


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"

     */

    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));

    }

    public static String fizzString(String str) {
        /*if (str.charAt(0) == 'f') {
            return (str.charAt(str.length() - 1) == 'b' ? "FizzBuzz" : "Fizz");
        } else {
            return ((str.charAt(str.length() - 1) == 'b') ? "Buzz" : str);
        }*/
        if (str.charAt(0) == 'f'&&str.charAt(str.length() - 1) == 'b')return "FizzBuzz";
        if (str.charAt(0) == 'f')return "Fizz";
        if (str.charAt(str.length() - 1)=='b')return "Buzz";
        return str;

        //return (str.charAt(0)=='f'?((str.charAt(str.length()-1)=='b')?"FizzBuzz":"Fizz"):((str.charAt(str.length()-1)=='b')?"Buzz":str));


    }


}
