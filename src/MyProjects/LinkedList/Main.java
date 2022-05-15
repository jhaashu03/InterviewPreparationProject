package MyProjects.LinkedList;

import MyProjects.LinkedList.SinglyLinkedList.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("-------------------------Linked List-----------------------");

        SinglyLinkedList sll = new SinglyLinkedList();
        SortLinkedList sortLinkedList = new SortLinkedList();

        InsertIntoSinglyLinkedList insertIntoSinglyLinkedList = new InsertIntoSinglyLinkedList();
        insertIntoSinglyLinkedList.insertAtLast(2);
        insertIntoSinglyLinkedList.insertAtLast(6);
        insertIntoSinglyLinkedList.insertAtLast(4);
        insertIntoSinglyLinkedList.insertAtFirst(1);
        insertIntoSinglyLinkedList.insertAfterData(10, 6);
        insertIntoSinglyLinkedList.print(insertIntoSinglyLinkedList.head);

        insertIntoSinglyLinkedList.head = sortLinkedList.mergeSort(insertIntoSinglyLinkedList.head);
        //System.out.println("Merge sort on Linked List");
        //insertIntoSinglyLinkedList.print(insertIntoSinglyLinkedList.head);
        //new DeleteANode().deleteNode(10,insertIntoSinglyLinkedList.head);
        //insertIntoSinglyLinkedList.print(insertIntoSinglyLinkedList.head);
        new LoopsInLinkedList().createLoop(insertIntoSinglyLinkedList.head);

    }
}