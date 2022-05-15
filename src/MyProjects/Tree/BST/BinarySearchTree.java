package MyProjects.Tree.BST;

public class BinarySearchTree {
    Node root;

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(){
            left = null;
            right = null;
        }

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }


    public Node insertRec(Node root, int data){
        Node new_node = new Node(data);

        if(root == null){
            root= new_node;
            return root;
        }
        if(data<root.data){
            root.left = insertRec(root.left,data);
        }
        else{
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    //findMinAndMaxElement
    public String minMax(Node root){
        Node temp1 = root;
        Node temp2 = root;
        int max=0;int min =0;
        while(temp1!=null){
            max=temp1.data;
            temp1 =temp1.right;
        }
        while(temp2!=null){
            min= temp2.data;
            temp2= temp2.left;
        }
        return "Max value: "+ max+"\n"+"Min Value: "+min;
    }

    //search
    public boolean search(Node root, int key){
        if(root == null)
            return false;
        if(root.data == key)
            return true;
        if(root.data>key)
            return search(root.left , key);
        else
            return search(root.right , key);
    }

    public void inOrder(Node root){
        if(!(root == null)){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    //Find height
    public int findHeight(Node root){
        if(root == null)
            return 0;
        else{
            int leftHeight = findHeight(root.left);
            int rightHeight = findHeight(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }

    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();
        Node root = new Node(50);
        bst.insertRec(root,30);
        bst.insertRec(root,20);
        bst.insertRec(root,40);
        bst.insertRec(root,70);
        bst.insertRec(root,60);
        bst.insertRec(root,80);

        bst.inOrder(root);

        System.out.println(bst.search(root,100));
        System.out.println("Height = "+bst.findHeight(root));
        System.out.println(bst.minMax(root));
    }

}
