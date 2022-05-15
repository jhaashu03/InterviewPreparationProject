package MyProjects.Map.Hashtable;

import java.util.*;

public class HashtableDemo {
    public static void main(String args[]) {
        Hashtable<Temp,String> h = new Hashtable(); // default initial capacity i.e 11
        //Hashtable h = new Hashtable(25);  //if we change the intial capacity output will be change
        h.put(new Temp(5), "A");
        h.put(new Temp(2), "B");
        h.put(new Temp(6), "C");
        h.put(new Temp(15), "D");
        h.put(new Temp(23), "E");
        h.put(new Temp(16), "F");
        //h.put(null,"H");
        System.out.println(h.put(new Temp(5), "Z"));
        //h.put("I",null); //NPE
        System.out.println(h); // From top to bottom and right to left from the bucket
        System.out.println(h.get("E"));
        for(Map.Entry<Temp,String> c : h.entrySet()){
            System.out.println(c.hashCode()+" "+c.getKey()+" ");
        }
    }
}
