package MyProjects.Collections.ComparatorPackage;

import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if (i1 < i2)
            return 1;
        else if (i1 > i2)
            return -1;
        else
            return 0;

        //or return i2.compareTo(i1) [Descending order]
        //return -i1.compareTo(i2) {Descending order]
        //retunr i1.compareTo(i2) [Ascending order]
    }
}
