package MyProjects.LinkedList.SinglyLinkedList;

public class SortLinkedList extends SinglyLinkedList {
    MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();

    public Node mergeSort(Node first) {
        if (first == null || first.next == null) {
            return first;
        }
        Node middle = middleOfLinkedList.findMiddle(first);
        Node nextmiddle = middle.next;
        middle.next = null;
        Node left = mergeSort(first);
        Node right = mergeSort(nextmiddle);

        Node sortedlist = sortedMerge(left, right);

        return sortedlist;
    }

    private Node sortedMerge(Node left, Node right) {
        Node result = null;
        if (left == null)
            return right;
        if (right == null)
            return left;

        if (left.data >= right.data) {
            result = right;
            result.next = sortedMerge(left, right.next);
        } else {
            result = left;
            result.next = sortedMerge(left.next, right);
        }
        return result;
    }
}
