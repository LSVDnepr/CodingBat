package map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB {
    /*
    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
    If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","Hi");
        map.put("b","There");
        System.out.println(mapAB(map).entrySet());


        HashMap<String,String> map2=new HashMap<>();
        map2.put("a","Hi");
        System.out.println(mapAB(map2).entrySet());

        HashMap<String,String> map3=new HashMap<>();
        map3.put("b","There");
        System.out.println(mapAB(map3).entrySet());


    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.isEmpty()) return map;
        if (map.containsKey("a")&&map.containsKey("b")){
            map.put("ab",(map.get("a").concat(map.get("b"))));
        }

        return map;
    }





}
