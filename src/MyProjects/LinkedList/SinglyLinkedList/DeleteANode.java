package MyProjects.LinkedList.SinglyLinkedList;

public class DeleteANode extends SinglyLinkedList {
    public void deleteNode(int deleteData, Node head) {
        Node first = head;
        Node prev = head;
        int count = 0;
        while (first.data != deleteData) {
            prev = first;
            first = first.next;
            count++;
        }

        //delete head
        if (count == 0) {
            head = first.next;
            print(head);
            return;
        }

        //delete last node
        if (first.next == null) {
            prev.next = null;
            print(head);
            return;
        }

        //Any in between delete
        prev.next = first.next;
        print(head);

    }
}
