package MyProjects.LinkedList.SinglyLinkedList;

public class ReverseALinkedList extends SinglyLinkedList {
    public void reverseLinkedList(Node head) {
        Node prev = null;
        Node next = null;
        Node first = head;
        while (first != null) {
            next = first.next;
            first.next = prev;
            prev = first;
            first = next;
        }
        first = prev;
        print(first);
    }

    //nned to work on
   /* public void reverseLinkedListSizeK(Node head, int k){
        Node prev = null;
        Node next = null;
        Node first = head;
        Node current = head;
        Node newHead = head;
        Node tail = head;
        int count =0;
        while(count<k && first!=null){

            next = first.next;
            first.next = prev;
            prev = first;
            first = next;
            count++;
        }
        if(newHead == null)
            newHead = prev;
        if(tail!=null){
            tail.next = prev;
        }

        print(first);
    }*/
}
