package MyProjects.Map;

import java.util.*;

public class MapDemo {
    public static void main(String args[]) {
        HashMap m = new HashMap();
        Map m1 = new HashMap();
        m1.put('C', 3);
        m1.put('A', 1);
        m1.put('D', 4);
        m1.put('B', 2);

        m.putAll(m1);

        System.out.println(m);
        System.out.println(m1);
        System.out.println(m.get('C')); //3
        System.out.println(m.containsKey('C')); //true
        System.out.println(m1.put('C', 33)); //3
        System.out.println(m1);
        m.remove(1.1);
        System.out.println(m);
        System.out.println(m1.containsKey(1));

        Set s = m.keySet();//get keys
        System.out.println(s);

        Collection c = m.values(); //Values
        System.out.println(c);

        Set s1 = m.entrySet(); // Entry set
        System.out.println(s1);

        Iterator i = s1.iterator();
        while (i.hasNext()) {
            Map.Entry e = (Map.Entry) i.next();
            if (e.getKey().equals(3)) {
                e.setValue("Ashutosh");
            }
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
