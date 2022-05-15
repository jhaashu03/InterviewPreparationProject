package MyProjects.Collections;

import java.util.*;

//it defines serveral methods of navigation purpose
public class NavigableSetDemo {
    public static void main(String args[]){
        NavigableSet ns = new TreeSet();
        for(int i=0;i<=10;i++)
            ns.add(i%10);
        System.out.println(ns);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //System.out.println(ns.descendingSet());//[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
        System.out.println(ns.floor(5));//5 <=5
        System.out.println(ns.lower(5));//4 <5
        System.out.println(ns.ceiling(5));//5 >=5
        System.out.println(ns.higher(5));//6 >5
        System.out.println(ns.pollFirst());//0
        System.out.println(ns.pollLast());//9
        System.out.println(ns);

    }
}
