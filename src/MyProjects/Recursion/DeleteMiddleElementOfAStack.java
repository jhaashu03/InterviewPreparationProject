package MyProjects.Recursion;

import java.util.Stack;

public class DeleteMiddleElementOfAStack {
    public static void main(String args[]){
        Stack<Integer> s = new Stack();
        s.push(6);
        s.push(5);
        s.push(9);
        s.push(3);
        s.push(10);

        int middle = s.size()/2 + 1;

        deleteMiddle(s,middle);

        for(Integer i : s)
            System.out.println(i);
    }

    private static void deleteMiddle(Stack<Integer> s, int k) {
        if(k==1){
            s.pop();
            return;
        }
        else{
            int temp = s.peek();
            s.pop();
            deleteMiddle(s,k-1);
            s.push(temp);
        }
    }
}
