package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(7);
        hs.add(2);

        System.out.println(hs);
        hs.remove(2);

        if(hs.contains(2)){
            System.out.println("contains key 2");
        }

        System.out.println(hs.size());

        // Iteration of HashSet
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Mumbai");

        System.out.println("Using iterator: ");
        Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Using advanced for loop: ");
        for(String city : cities){
            System.out.println(city);
        }
    }
}
