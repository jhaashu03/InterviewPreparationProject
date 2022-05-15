package MyProjects.Map;

import java.util.*;

public class StringToMap {
    static int j =10;

    public static void main(String args[]) {
        String s = "zaca";
        //SortedMap m = new TreeMap();
        Map<Character,Integer> m = new HashMap();
        SortedMap m1 = new TreeMap();
        m1.put('a', 1);
        m1.put('b', 1);
        m1.put('c', 2);
        //System.out.println(m1);
        //System.out.println(m1.equals(m));
        for (int i = 0; i < s.length(); i++) {
            if (!m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), 1);
            } else {
                int n = (Integer) m.get(s.charAt(i));
                m.put(s.charAt(i), n + 1);

            }
        }
        for(Map.Entry<Character,Integer> c : m.entrySet()){
            System.out.println(c.hashCode()+" "+c.getKey()+" ");
        }
        System.out.println(m);
        System.out.println(j);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
