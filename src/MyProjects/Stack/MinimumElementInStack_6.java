package MyProjects.Stack;

import java.util.Map;
import java.util.Stack;

public class MinimumElementInStack_6 {
    Stack<Integer> s;
    Stack<Integer> s1;
    //Approch-2 in o(1)
    Integer minElement;

    MinimumElementInStack_6(){
        s = new Stack<>();
        s1 = new Stack<>();

        minElement=-1;
    }

    public static void main(String args[]){

        MinimumElementInStack_6 stack = new MinimumElementInStack_6();

        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.pop();
        System.out.println(stack.getMinWithExtraSpace());
        stack.push(15);
        System.out.println(stack.getMinWithExtraSpace());
        stack.push(16);
        stack.print();
    }

    public int getMinWithExtraSpace(){
        return minElement;
    }

    public int getMinWithoutExtraSpace(){
        return s1.peek();
    }

    public void push(int data){
        if(s1.isEmpty()){
            s1.push(data);
            //method-2
            minElement= data;
        }
        else{
            if(s1.peek()<data){
                s1.push(s1.peek());
            }
            else{
                s1.push(data);
            }
            //method-2
            /*if(data>=minElement){
                s.push(data);
            }
            else{
                s.push(2*data-minElement);
                minElement=data;
            }*/
        }

        //method-2

        minElement = Math.min(minElement,data);
        s.push(data);
    }



    public void pop(){
        s.pop();
        s1.pop();

        //method-2
        /*if(s.isEmpty())
            return;
        else{
            if(s.peek()>=minElement)
                s.pop();
            else if(s.peek()<minElement){
                minElement = 2*minElement-s.peek();
                s.pop();
            }
        }*/

    }

    private void print(){
        System.out.println("Main stack");
        for(Integer i: s)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("Supporting stack");
        for(Integer i: s1)
            System.out.print(i+" ");
    }

}


