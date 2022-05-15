package MyProjects.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;

    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    public void print(Node head) {
        Node first = head;
        while (first != null) {
            if (first.next == null)
                System.out.print(first.data);
            else
                System.out.print(first.data + " -> ");
            first = first.next;
        }
        System.out.println();
    }
}
