//Lecture-3

package MyProjects.Recursion;

//Height of a Binary Tree

public class BinaryTree {
    Node root;

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is : " + tree.heightOfTree(tree.root));
    }

    private int heightOfTree(Node root) {
        if(root==null)
            return 0;
        else {
            int leftHeight  = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            return 1+Math.max(leftHeight,rightHeight);
        }
    }
}

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
