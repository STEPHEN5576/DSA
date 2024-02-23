package Hashmap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Stephen", 22);
        System.out.println(map.get("Stephen"));
        System.out.println(map.containsKey("Stephen"));
    }
}
