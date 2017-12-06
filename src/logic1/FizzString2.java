package logic1;

public class FizzString2 {
    /*
    Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
    Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz",
    and if divisible by both 3 and 5, use "FizzBuzz".

fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
     */


    public static void main(String[] args) {
        System.out.println(fizzString2(1));
        System.out.println(fizzString2(2));
        System.out.println(fizzString2(3));


    }


    public static String fizzString2(int n) {
        if (n % 3 == 0) {
            return (n % 5 == 0 ? "FizzBuzz!" : "Fizz!");
        }
        if (n % 5 == 0) return "Buzz!";
        return String.valueOf(n) + "!";

    }

}
