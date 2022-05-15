package MyProjects.Collections.ComparatorPackage;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) {
        TreeSet s = new TreeSet();
        s.add(5);
        s.add(8);
        s.add(3);
        s.add(9);
        s.add(6);
        System.out.println(s);

        //Lambda experssion
        Comparator<Integer> c = (o1,o2)-> o2.compareTo(o1);

        TreeSet s1 = new TreeSet(c);
        s1.add(5);
        s1.add(8);
        s1.add(3);
        s1.add(9);
        s1.add(6);
        System.out.println(s1);

    }
}
