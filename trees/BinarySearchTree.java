package trees;

public class BinarySearchTree {

    Node root;

    public void insert(Node node){
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){
        int data = node.data;
        if(root == null){
            root = node;
            return root;
        } else if (data < root.data){
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);

        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }

    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data){
        if(root == null){
            return false;
        } else if (root.data == data){
            return true;
        } else if (data < root.data){
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){
        if (search(data)){
            root = removeHelper(root, data);
        } else {
            System.out.println(data + " not found");
        }
    }

    private Node removeHelper(Node root, int data){
        if (root == null){
            return root;
        } else if (data < root.data){
            root.left = removeHelper(root.left, data);
        } else if (data > root.data){
            root.right = removeHelper(root.right, data);
        } else { // node to be removed found
            if (root.left == null && root.right == null){ // check if node is a leaf node
                return null;
            } else if (root.right != null){ // find a successor to replace the node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else { // find a predecessor to replace the node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root){ // find the least value below the right child of this root node
        root = root.right;
        while (root.left != null){
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root){
        root = root.left;
        while (root.right != null){
            root = root.right;
        }
        return root.data;
    }

}
