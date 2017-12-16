package map1;

import java.util.HashMap;
import java.util.Map;

public class Topping3 {
    /*
    Given a map of food keys and topping values, modify and return the map as follows:
    if the key "potato" has a value, set that as the value for the key "fries".
    If the key "salad" has a value, set that as the value for the key "spinach".

topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("potato","ketchup");
        System.out.println(topping3(map).entrySet());

        HashMap<String,String> map2=new HashMap<>();
        map2.put("potato","butter");
        System.out.println(topping3(map2).entrySet());

        HashMap<String,String> map3=new HashMap<>();
        map3.put("salad","oil");
        map3.put("potato","ketchup");
        System.out.println(topping3(map3).entrySet());



    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.isEmpty()) return map;
        if (map.containsKey("potato")&&map.get("potato")!=null) map.put("fries", map.get("potato"));
        if (map.containsKey("salad")&&map.get("salad")!=null) map.put("spinach", map.get("salad"));
        return map;
    }


}
