package MyProjects.DP.DPOnTree;

import java.util.Map;

public class DiameterOfABinaryTree_1 {
    public static void main(String args[])
    {
        // creating a binary tree and entering the nodes
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int result = Integer.MIN_VALUE;

        // Function Call
        System.out.println(
                "The diameter of given binary tree is : "
                        + diameter(root,result));
    }

    public static int diameter(Node root, int result) {
        if(root==null)
            return 0;

        int l = diameter(root.left,result);
        int r = diameter(root.right, result);

        int temp = 1 + Math.max(l,r);
        int ans  = Math.max(temp,l+r+1);
        result = Math.max(temp, ans);
        return result;
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}