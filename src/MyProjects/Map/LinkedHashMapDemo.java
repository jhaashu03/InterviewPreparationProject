package MyProjects.Map;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String args[]) {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put('C', 3);
        hm.put('A', 1);
        hm.put('D', 4);
        hm.put('B', 2);

        System.out.println(hm);

        Set s1 = hm.entrySet();
        Iterator i = s1.iterator();

        while (i.hasNext()) {
            Map.Entry e = (Map.Entry) i.next();
            System.out.println(e.getValue() + ":" + e.getKey());
        }
    }
}
