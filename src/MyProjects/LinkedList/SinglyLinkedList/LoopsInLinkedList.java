package MyProjects.LinkedList.SinglyLinkedList;

public class LoopsInLinkedList extends SinglyLinkedList {

    //Create loop
    public void createLoop(Node head) {
        Node first = head;
        first.next.next.next.next = first.next.next;
        print(first);
    }
}
