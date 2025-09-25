package Hashing;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // put
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Nepal", 5);

        System.out.println(hm);

        // get
        System.out.println(hm.get("China"));

        // containsKey
        System.out.println(hm.containsKey("India"));

        // remove
        hm.remove("China");
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm);
    }
}
