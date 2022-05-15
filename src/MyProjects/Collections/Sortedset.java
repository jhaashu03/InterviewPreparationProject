package MyProjects.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {
    public static void main(String args[]) {
        SortedSet s = new TreeSet();
        s.add(3);
        s.add(0);
        s.add(12);
        s.add(1);
        s.add(19);
        s.add(-3);
        System.out.println(s);
        System.out.println(s.headSet(1));
        System.out.println(s.tailSet(1));
        System.out.println(s.subSet(0, 12));
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.comparator());


    }
}
