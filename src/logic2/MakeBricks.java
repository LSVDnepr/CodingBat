package logic2;

public class MakeBricks {
    /*

We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
     */


    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
        System.out.println(makeBricks(3, 2, 9));
        System.out.println(makeBricks(1, 4, 12));
        System.out.println(makeBricks(7, 1, 11) );



    }



    public static boolean makeBricks(int small, int big, int goal) {
      //  System.out.println("ИСХОДНЫЕ ДАННЫЕ: small="+small+", big="+big+", goal="+goal);
        //если суммарная длина меньше цели
        if ((small+big*5)<goal){
            return false;
        }

        //если не хватает маленьких кирпичей
        if (goal%5>small)return false;
        return true;

    }



}
