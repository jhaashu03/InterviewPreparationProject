package MyProjects.Collections.Queue;

import java.util.*;

public class QueueDemo {
    public static void main(String args[]) {
        Queue q = new LinkedList();
        Queue q1 = new ArrayDeque();
        q1.add(1);
        PriorityQueue pq = new PriorityQueue();  // initial capacity 11
        //System.out.println(pq.peek());  //NULL
        //System.out.println(pq.element()); //Runtime Exception: no such element exception

        for (int i = 0; i <= 10; i++) {
            q.offer(i);
            pq.offer(i);
        }
        //System.out.println(q);
        System.out.println(pq);
        System.out.println(pq.poll()); // ) is head element since inserted first
        // if not getting the excepted output for below sop i.e [1,2,3...,10} because
        // Some platform won't provide proper support for thread priority and priority queue
        System.out.println(pq);

    }
}
