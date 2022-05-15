
package MyProjects.LinkedList.SinglyLinkedList;

public class InsertIntoSinglyLinkedList extends SinglyLinkedList {
    public void insertAtLast(int new_data) {

        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.next = null;
        return;
    }

    public void insertAtFirst(int new_data) {

        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = head;
        head = new_node;


    }

    public void insertAfter(int new_data, Node prev) {
        Node new_node = new Node(new_data);
        new_node.next = prev.next;
        prev.next = new_node;
    }

    public void insertAfterData(int new_data, int d) {
        Node new_node = new Node(new_data);
        Node first = head;
        while (first.data != d) {
            first = first.next;
        }
        new_node.next = first.next;
        first.next = new_node;
    }
}
