package MyProjects.Recursion;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String args[]){
        Stack<Integer> s = new Stack();
        s.push(6);
        s.push(5);
        s.push(9);
        s.push(3);
        s.push(10);

        System.out.println("Orignal stack");
        for(Integer i : s)
            System.out.println(i);

        System.out.println("Reversed");
        reverse(s);
        for(Integer i : s)
            System.out.println(i);
    }

    private static void reverse(Stack<Integer> s) {
        if(s.size()==1)
            return;

        int temp = s.peek();
        s.pop();
        reverse(s);

        insert(s,temp);

    }

    private static void insert(Stack<Integer> s, int temp) {
        if(s.size()==0){
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
