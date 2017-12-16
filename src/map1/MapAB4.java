package map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB4 {
    /*
Modify and return the given map as follows:
if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value.
If the values exist and have the same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
     */

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        System.out.println(mapAB4(map).entrySet());

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        map2.put("c", "cake");
        System.out.println(mapAB4(map2).entrySet());

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("a", "aa");
        map3.put("b", "bbb");
        System.out.println(mapAB4(map3).entrySet());

        HashMap<String, String> map4 = new HashMap<>();
        map4.put("a", "aaa");
        map4.put("b", "bbb");
        System.out.println(mapAB4(map4).entrySet());

    }


    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.isEmpty() || !map.containsKey("a") || !map.containsKey("b")) return map;
        if (map.get("a").length() != map.get("b").length()) {
            map.put("c", (map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b")));
        } else {
            map.replace("a", "");
            map.replace("b", "");
        }

        return map;
    }


}
