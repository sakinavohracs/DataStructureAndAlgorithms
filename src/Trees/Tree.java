package Trees;

public class Tree {

    Node root;

    public Node getRoot(){
        return root;
    }

    public void setRoot(Node root){
        this.root = root;
    }

    public void insert(int rootData) {
        if (root == null) {
            root = new Node(rootData);
        }
        else {
            root.insert(rootData);
        }
    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }

    }

}
