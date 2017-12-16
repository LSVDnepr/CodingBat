package map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    /*
    Modify and return the given map as follows:
    if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","aaa");
        map.put("b","aaa");
        map.put("c","cake");
        System.out.println(mapAB2(map).entrySet());

        HashMap<String,String> map2=new HashMap<>();
        map2.put("a","aaa");
        map2.put("b","bbb");
        System.out.println(mapAB2(map2).entrySet());

        HashMap<String,String> map3=new HashMap<>();
        map3.put("a","aaa");
        map3.put("b","bbb");
        map3.put("c","aaa");
        System.out.println(mapAB2(map3).entrySet());


    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.isEmpty()) return map;
        if (!map.containsKey("a")||!map.containsKey("b")) return map;
        if (map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }





}
