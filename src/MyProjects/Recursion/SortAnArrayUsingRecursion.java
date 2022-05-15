//Lecture-4

package MyProjects.Recursion;

import java.util.Collections;
import java.util.Deque;
import java.util.*;

public class SortAnArrayUsingRecursion {
    public static void main(String args[]){
        Deque<Integer> q = new LinkedList<>();
        q.add(6);
        q.add(3);
        q.add(10);
        q.add(1);
        q.add(7);
        sort(q);

        for(Integer qq: q)
            System.out.println(qq);

    }

    private static void sort(Deque<Integer> q){

        //one element array is always sorted
        if(q.size()==1)
            return;

        int temp = q.getLast();
        q.removeLast();
        sort(q);

        insert(q,temp);
    }

    private static void insert(Deque<Integer> q, int temp) {
        if(q.size()==0||q.getLast()<=temp){
            q.addLast(temp);
            return;
        }
        else{
            int val = q.getLast();
            q.removeLast();
            insert(q,temp);
            q.addLast(val);
        }
    }
}
