package b5_maps;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Blue");
        hm.put(4, "White");
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);

        Map map = Map.of(1, "Red", 2, "Green", 3, "Three", 4, "White");
        System.out.println(map);

        hm.putAll(map);
        System.out.println(hm);
    }
}
