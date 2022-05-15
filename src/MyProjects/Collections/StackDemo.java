package MyProjects.Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackDemo {
    public static void main(String args[]) {
        Stack s = new Stack();
        //System.out.println(s.peek());
        s.push('A');
        s.push(1);
        s.push(2.5);
        s.push("Ashu");
        System.out.println(s);
        System.out.println(s.peek());
        //System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search("Ashu"));
        System.out.println(s.search('A'));
        System.out.println("Queue");
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);

    }
}
