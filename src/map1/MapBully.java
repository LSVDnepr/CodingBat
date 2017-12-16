package map1;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
    and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        System.out.println(mapBully(map).entrySet());

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");
        System.out.println(mapBully(map2).entrySet());

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b", "carrot");
        map3.put("c", "meh");
        System.out.println(mapBully(map3).entrySet());

    }


    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.isEmpty()) return map;
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.replace("a", "");
        }
        return map;

    }


}
