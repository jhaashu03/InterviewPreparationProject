package MyProjects.StringAndArray.Array.StackUsingArray;

public class Main {
    public static void main(String args[]){
        Stack s = new Stack(11);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        System.out.println("Size of stack:"+s.size());

        s.print();
        System.out.println("Pop: "+s.pop());
        s.print();
    }
}
