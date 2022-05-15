package MyProjects.Collections;

import java.util.*;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList l = new ArrayList(10);
        Vector v = new Vector(10, 2);
        l.add(10);
        l.add("Ashu");
        l.add(2.5);
        l.add(null);
        l.add(2);
        System.out.println(l.get(2));
        l.remove(2.5);
        System.out.println(l);
        l.add(0, 100000000);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);


    }
}

