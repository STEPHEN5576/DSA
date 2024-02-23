package Hashmap.Treemap;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Stephen" , 559);
        map.put("sten" , 558);
        map.put("ron" , 558);
        map.put("bon" , 557);
        map.put("don" , 556);
//        map.ceilingEntry("ron");
        System.out.println(map.containsKey("sten"));
        System.out.println(map);
    }
}
