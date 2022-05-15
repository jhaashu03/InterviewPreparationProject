package MyProjects.Tree.BST;

public class IsBST {
    Node root;

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data){
        Node new_node = new Node(data);
        if(root == null){
            root = new_node;
            return root;
        }
        if(data>root.data)
                root.right = insertRec(root.right,data);
        else
            root.left = insertRec(root.left,data);
        return root;
    }

    public boolean isBinarySeacrh(){
        return  iSBSTUtil(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    private boolean iSBSTUtil(Node root, int max, int min){
        if(root == null)
            return true;
        if((root.data<max && root.data>min) && iSBSTUtil(root.left,root.data,min) && iSBSTUtil(root.right,max,root.data))
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        IsBST isBST = new IsBST();
        isBST.insert(50);
        isBST.insert(30);
        isBST.insert(70);
        isBST.insert(20);
        isBST.insert(90);

        //Node n = new Node(10);
        //isBST.root.right.right = n;

        System.out.println(isBST.isBinarySeacrh());
    }
}
