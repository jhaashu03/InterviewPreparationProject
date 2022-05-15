package MyProjects.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String args[]) {
        HashSet h = new HashSet();
        h.add(1);
        h.add("A");
        h.add(2);
        h.add("B");
        h.add(null);
        h.add(3);

        System.out.println(h);
        System.out.println(h.add(2)); //false
        System.out.println(h.add(4)); //true
        System.out.println(h);
        System.out.println("Remove 4: "+h.remove(4)); //true
        System.out.println(h);
        LinkedHashSet lh = new LinkedHashSet();
        lh.add(1);
        lh.add("A");
        lh.add(2);
        lh.add("B");
        lh.add(null);
        lh.add(3);
        System.out.println(lh.add(2));
        System.out.println(lh);

    }
}
