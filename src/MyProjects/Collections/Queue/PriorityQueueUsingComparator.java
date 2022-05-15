package MyProjects.Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueUsingComparator {
    public static void main(String args[]) {
        /*PriorityQueue q1 = new PriorityQueue();
        q1.offer("A");
        q1.offer("Z");
        q1.offer("L");
        q1.offer("B");
        System.out.println(q1);*/ //[A, B, L, Z]

        PriorityQueue q2 = new PriorityQueue(15, new MyComparatorQueue());
        q2.offer("A");
        q2.offer("Z");
        q2.offer("L");
        q2.offer("B");
        System.out.println(q2);//[Z,L,B,A]

    }

}
