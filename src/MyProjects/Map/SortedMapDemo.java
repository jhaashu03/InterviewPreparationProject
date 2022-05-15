package MyProjects.Map;

import java.util.*;

public class SortedMapDemo {
    public static void main(String args[]) {
        SortedMap sm = new TreeMap();
        sm.put(101, 'A');
        sm.put(102, 'B');
        sm.put(103, 'C');
        sm.put(104, 'D');
        sm.put(105, 'E');
        sm.put(106, 'F');

        //sm.put("X",'Z'); //java.lang.ClassCastException, heterogenous object not allowed in default natural sorting order
        //sm.put(null,'R'); //NPE

        System.out.println("First Key: " + sm.firstKey());
        System.out.println("Last Key: " + sm.lastKey());
        System.out.println("Head MyProjects.Map");
        System.out.println(sm.headMap(103));
        System.out.println("Tail MyProjects.Map");
        System.out.println(sm.tailMap(103));
        System.out.println("Sub MyProjects.Map");
        System.out.println(sm.subMap(102, 105));
        System.out.println(sm.comparator());
    }
}
