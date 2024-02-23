package Hashmap.Hashset;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // it deos not inculde duplicate elements
        set.add(20);
        set.add(20);
        set.add(20);
        set.add(20);
        set.add(40);
        System.out.println(set);
    }
}
