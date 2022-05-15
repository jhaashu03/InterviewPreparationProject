package MyProjects.LinkedList.SinglyLinkedList;


public class MiddleOfLinkedList extends SinglyLinkedList {
    public Node findMiddle(Node first) {

        if (first == null)
            return head;
        Node slow = first;
        Node fast = first;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
