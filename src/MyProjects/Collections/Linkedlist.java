package MyProjects.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        //LinkedList also implements queue
        //l.peek();
        //l.poll();
        //l.pollFirst()
        //l.offer(15);
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.addFirst(8);
        l.addLast(15);
        System.out.println(l);
        //Iterator
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            int n = (Integer) itr.next();
            if (n % 2 == 0)
                System.out.println("Even number: " + n);
            else {
                System.out.println("Old number:" + n);
                itr.remove();
            }
        }
        System.out.println(l);

        //LteratorList
        ListIterator litr = l.listIterator();
        int i = 51;
        litr.add(6);
        while (litr.hasNext()) {
            int n = (Integer) litr.next();
            if (n == 10) {
                litr.set(50);
            }
            if (n == 12) {
                litr.remove();
            } else {
                litr.add(i++);
            }
        }

        System.out.println(l);
        System.out.println(litr.nextIndex());
        System.out.println("Previous index: " + litr.previousIndex());
        while (litr.hasPrevious()) {
            int n = (Integer) litr.previous();
            System.out.println("Previous index: " + litr.previousIndex());
            System.out.println(n);
        }


    }
}
