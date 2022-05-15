//Lecture-5

package MyProjects.Recursion;

import java.util.*;

public class SortAStack {
    public static void main(String args[]){
        Stack<Integer> s = new Stack();
        s.push(6);
        s.push(5);
        s.push(9);
        s.push(3);

        sort(s);

        for(Integer i : s)
            System.out.println(i);
    }

    private static void sort(Stack<Integer> s){
        if(s.size()==1)
            return;

        int temp = s.peek();
        s.pop();
        sort(s);

        insert(s, temp);
    }

    private static void insert(Stack<Integer> s, int temp){
        if(s.size()==0 || s.peek()<=temp){
            s.push(temp);
            return;
        }
        else {
            int val = s.peek();
            s.pop();
            insert(s,temp);
            s.push(val);
        }
    }

}
