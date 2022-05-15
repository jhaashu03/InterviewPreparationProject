package MyProjects.Map.WeakHashMap;

import java.util.*;

public class WeakHashMapDemo {
    public static void main(String args[]) throws InterruptedException {
        //Hashmap
        HashMap hm = new HashMap();
        Temp t = new Temp();
        hm.put(t, "HashMap");
        System.out.println(hm);
        t = null;  // not eligible for gc because it is associated with HashMap which is stronger than gc
        System.gc();
        Thread.sleep(5000);
        System.out.println(hm);

        //WeakHashMap
        WeakHashMap whm = new WeakHashMap();
        Temp t1 = new Temp();
        whm.put(t1, "WeakHashMap");
        System.out.println(whm);
        t1 = null; // Eligible for gc because it is associated with WeakHashMap which is less stronger than gc
        System.gc();
        Thread.sleep(5000);
        System.out.println(whm);

    }
}
