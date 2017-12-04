package warmup2;

public class Has271 {
    /*

Given an array of ints, return true if it contains a 2, 7, 1 pattern:
 a value, followed by the value plus 5, followed by the value minus 1.
 Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
     */


    public static void main(String[] args) {
        System.out.println(has271(new int[]{1, 2, 7, 1}));
        System.out.println(has271(new int[]{1, 2, 8, 1}));
        System.out.println(has271(new int[]{2, 7, 1}));
        System.out.println(has271(new int[]{2, 7, 4}));
        System.out.println(has271(new int[]{2, 7, 5, 10, 1}));


    }


   /* public static boolean has271(int[] nums) {
        if (nums.length <= 2) return false;
        for (int i=0;i<nums.length-2;i++){
            //System.out.println("база  для сравнения="+nums[i]+" проверяю вторую цифру: ");
            if (nums[i+1]==nums[i]+5){
                //System.out.println("вторая цифра совпала="+nums[i+1]+" проверяю третью цифру");
                //System.out.println("вторая цифра совпадает, проверяю третью цифру");
            }else{
                //System.out.println("вторая цифра не подошла, меняю базу сравнения");
                continue;
            }
            if ((nums[i+2]>=nums[i]-3)&&(nums[i+2])<=nums[i]+1){
               // System.out.println("третья цифра совпала="+nums[i+2]);
                return true;
            }
        }
        return false;
    }*/


    public static boolean has271(int[] nums) {
        if (nums.length <= 2) return false;
        for (int i=0;i<nums.length-2;i++){
            if (nums[i+1]!=nums[i]+5)continue;
            if ((nums[i+2]>=nums[i]-3)&&(nums[i+2])<=nums[i]+1) return true;
        }
        return false;
    }


}
