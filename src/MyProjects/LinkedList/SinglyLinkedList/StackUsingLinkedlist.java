package MyProjects.LinkedList.SinglyLinkedList;

public class StackUsingLinkedlist {

    public static void main(String args[]){

        StackUsingLinkedlist s = new StackUsingLinkedlist();
        s.push(10);
        s.push(30);
        s.push(25);
        s.push(19);
        s.push(6);
        s.print();
        s.pop();
        s.print();
    }


    public SNode top;
    StackUsingLinkedlist(){
        top = null;
    }

    public void push(int data){
        SNode temp = new SNode();
        temp.data = data;

        temp.next = top;
        top = temp;
    }

    public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void print(){
        SNode temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

class SNode{
    int data;
    SNode next;
}
