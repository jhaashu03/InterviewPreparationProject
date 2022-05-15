package MyProjects.LinkedList.SinglyLinkedList;

public class MergeTwoSortedLinkedLists {
    private Node head;

    public static void main(String args[]){
        MergeTwoSortedLinkedLists l1 = new MergeTwoSortedLinkedLists();
        MergeTwoSortedLinkedLists l2 = new MergeTwoSortedLinkedLists();
        MergeTwoSortedLinkedLists l3 = new MergeTwoSortedLinkedLists();
        l1.push(5);
        l1.push(4);
        l1.pushLast(6);
        l1.pushLast(7);

        l2.push(10);
        l2.push(2);
        l2.push(1);
        l2.push(0);
        //l1.printNode();

        l3.merge(l1.head,l2.head);

    }

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pushLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    public void printNode(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void merge(Node a, Node b){
        Node result = new Node(-1);
        Node last = result;

        while(true){
            if(a==null){
                last.next = b;
                break;
            }

            if(b==null){
                last.next = a;
                break;
            }

            if(a.data<=b.data){
                last.next = a;
                a= a.next;
            }
            else{
                last.next = b;
                b= b.next;
            }

            last = last.next;

        }
        result = result.next;
        Node temp = result;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}

