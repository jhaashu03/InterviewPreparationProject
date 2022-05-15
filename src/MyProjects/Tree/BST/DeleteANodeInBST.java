package MyProjects.Tree.BST;

public class DeleteANodeInBST {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
        Node new_node = new Node(data);
        if(root == null){
            root = new_node;
            return root;
        }
        if(data>root.data){
            root.right = insertRec(root.right,data);
        }
        else {
            root.left = insertRec(root.left ,data);
        }
        return root;
    }

    public void inOrder(){
        inOrderRec(root);
    }
    public void inOrderRec(Node root){
        if(root!=null){

            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }

    public void delete(int data){
        root = deleteRec(root,data);
    }

    public Node deleteRec(Node root, int data){
       if(root == null)
           return null;
       if(data>root.data){
           root.right = deleteRec(root.right,data);
       }
       else if(data<root.data){
           root.left = deleteRec(root.left,data);
       }
       else{
           if(root.left == null)
               return root.right;
           else if(root.right == null)
               return root.left;

           //node with 2 child;

           root.data = minValue(root.right);
           root.right = deleteRec(root.right,root.data);
       }
       return root;
    }
     int minValue(Node root){
        int min = root.data;
        while(root.left!=null){
            min= root.data;
            root = root.left;
        }
        return min;
     }

    public static void main(String args[]){
        DeleteANodeInBST dbst = new DeleteANodeInBST();
        dbst.insert(50);
        dbst.insert(20);dbst.insert(60);
        dbst.insert(40);dbst.insert(70);
        dbst.insert(100);dbst.insert(10);
        dbst.insert(120);dbst.insert(30);

        dbst.inOrder();
        dbst.delete(50);
        System.out.println("After Delete");
        dbst.inOrder();
    }
}
