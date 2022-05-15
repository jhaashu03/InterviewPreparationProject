//https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/

package MyProjects.DP.DPOnTree;

public class MaximumPathSum_2 {
    public static void main(String args[])
    {
        // creating a binary tree and entering the nodes
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        int result = Integer.MIN_VALUE;

        // Function Call
        System.out.println(
                "The diameter of given binary tree is : "
                        + findMaxSum(root,result));
    }

    private static int findMaxSum(Node root, int result) {
        if(root==null)
            return 0;

        int left =  findMaxSum(root.left,result);
        int right = findMaxSum(root.right,result);

        //agar left aur right se negative aa raha toh sirf root ka value le lo
        int temp = Math.max(root.data + Math.max(left,right), root.data);
        int ans = Math.max(temp, left+right+root.data);
        result= Math.max(temp, ans);

        return temp;
    }
}
