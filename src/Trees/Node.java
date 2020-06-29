package Trees;

public class Node {

    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data){
        this.data = data;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }


    public void insert(int data){
        if(data == this.data){
            return;
        }
        if(data < this.data){
            if(leftChild == null) {
                leftChild = new Node(data);
            }
            else{
                leftChild.insert(data);
            }
        }

        else {
            if(rightChild == null) {
                rightChild = new Node(data);
            }
            else {
                rightChild.insert(data);
            }
        }
    }


    public void traverseInOrder(){

        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.println(data + " ");
        if(rightChild!=null) {
            rightChild.traverseInOrder();
        }
    }
}
