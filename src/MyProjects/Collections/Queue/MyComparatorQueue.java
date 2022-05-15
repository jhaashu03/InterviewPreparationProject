package MyProjects.Collections.Queue;

import java.util.Comparator;

public class MyComparatorQueue implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = (String) obj2;
        return s2.compareTo(s1);
    }
}
