package MyProjects.StringAndArray.Array.StackUsingArray;

public class Stack {
    int len;
    int arr[];
    int stackCapacity;
    Stack(){
        len =-1;
        arr = new int[10];
        stackCapacity = 10;
    }

    //100
    Stack(int capacity){
        len =-1;
        arr = new int[capacity];
        stackCapacity = capacity;
    }


    public void push(int data){
        if(len>=stackCapacity)
        {
            System.out.println("Stack is full");
            return;
        }

        arr[++len] = data;
    }

    public int pop(){
        if(len<0)
        {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[len--];

    }
    public int peek(){
        return arr[len];
    }

    public int size(){
        return len+1;
    }

    public void print() {
        for(int i=0;i<=len;i++)
            System.out.println(arr[i]);
    }
}
