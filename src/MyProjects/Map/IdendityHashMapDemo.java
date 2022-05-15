package MyProjects.Map;

import java.util.*;

public class IdendityHashMapDemo {
    public static void main(String args[]) {
        //first create normmal hashmap
        HashMap m1 = new HashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        m1.put(i1, "A");
        m1.put(i2, "B");         // hashmap uses .equals method to compare of keys are equal or not
        System.out.println(m1);

        //Identity hasMap
        IdentityHashMap m2 = new IdentityHashMap();
        m2.put(i1, "A");
        m2.put(i2, "B");
        System.out.println(m2);   //IdentityHasMap uses == operator to compare of keys are equal or not

    }
}
