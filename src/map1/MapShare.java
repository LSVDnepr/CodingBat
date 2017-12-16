package map1;

import java.util.HashMap;
import java.util.Map;

public class MapShare {
    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
    In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */


    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c","ccc");
        System.out.println(mapShare(map).entrySet());

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c","ccc");
        System.out.println(mapShare(map2).entrySet());

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");
        System.out.println(mapShare(map3).entrySet());


    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.isEmpty())return map;
        if (map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        map.remove("c");

        return map;
    }



}
