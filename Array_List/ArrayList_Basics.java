package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println(list.contains(2));

        System.out.println(list.get(2));

        list.add(1, 10);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, 3));
    }
}
