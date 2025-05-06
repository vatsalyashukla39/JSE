package NonLinearDS.ThreadedBinaryTree;

public class TBT {
    Node root;
    public TBT() {
        root = null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            root.setLeaf(true);
            return;
        }
        Node current = root;
        Node parent = null;
        Node grandParent = null;
        while (current != null) {
            grandParent=parent;
            parent = current;
            if (data < current.getData()) {
                current=current.getLeft();
            }
            else current=current.getRight();
        }
        if (data>parent.getData()){
            if(!parent.isLeaf()) {
                parent.setRight(newNode);
                newNode.setRight(grandParent);
            }
            else {
                newNode.setRight(parent.getRight());
                parent.setRight(newNode);
            }
        }
        else{
            parent.setLeft(newNode);
            newNode.setRight(parent);
        }
        parent.setLeaf(false);
        newNode.setLeaf(true);
    }
    public void inorder() {

    }
    public Node getLeftMost(Node root){
        while (root!=null&&root.getLeft() != null) root = root.getLeft();
        return root;
    }
}
