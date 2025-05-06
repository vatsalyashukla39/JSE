package NonLinearDS.Tree;

import java.util.NoSuchElementException;
import java.util.Stack;

public class BST {
    public Node root;
    public BST() {
        root = null;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (current!=null) {
            parent = current;
            if (data>current.getData()){
                current = current.getRight();
            }
            else {
                current = current.getLeft();
            }
        }
        if (data>parent.getData()){
            parent.setRight(newNode);
        }
        else{
            parent.setLeft(newNode);
        }
    }
    public void preOrder1() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;
        stack.push(root);
        while(!stack.isEmpty()) {

            if (current == null) {
                current=stack.pop();
            }
            System.out.println(current.getData());
            if (current.getLeft() != null) {
                stack.push(current.getLeft());
            }
            if (current.getRight() != null) {
                stack.push(current.getRight());
            }
            current = current.getLeft();
        }
    }
    public void preOrder() {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node current;
        while (!stack.isEmpty()) {
            current = stack.pop();
            while (current!=null) {
                System.out.println(current.getData());
                if (current.getRight()!=null) {
                stack.push(current.getRight());}
                current = current.getLeft();
            }
        }
    }

    public void inOrder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while(current!=null||!stack.isEmpty()) {
            while (current!=null) {
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.pop();
            System.out.println(current.getData());
            current = current.getRight();
        }
    }
    public void inOrder1() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while (temp!=null||!stack.isEmpty()) {
            if (temp!=null) {
                stack.push(temp);
                temp = temp.getLeft();
            }
            else {
                temp = stack.pop();
                System.out.println(temp.getData());
                temp = temp.getRight();
            }
        }
    }
    public Node[] search(int key) {
        Node current = root;
        Node parent = null;
        while (current!=null){
            if(current.getData()==key)return new Node[]{parent,current};
            parent=current;
            if (current.getData()<key)current=current.getRight();
            else current=current.getLeft();
        }return null;
    }

//    public void delete(int key) {
//        if (root == null) {
//            System.out.println("Tree is empty");
//            return;
//        }
//        Node [] arr=search(key);
//        if (arr == null)
//            throw new NoSuchElementException("No such element");
//        Node child = arr[1];
//        Node parent = arr[0];
//        if (child.getLeft()!=null&&child.getRight()!=null) {
//            Node successor = child.getRight();
//            parent=child;
//            while (successor.getLeft()!=null) {
//                parent=successor;
//                successor = successor.getLeft();
//            }
//            child.setData(successor.getData());
//            child=successor;
//        }
//        if (child.getLeft()==null&&child.getRight()==null){
//            if (parent==null) {
//                root = null;
//            }
//            else if (child==parent.getLeft()){
//                parent.setLeft(null);
//            }
//            else {
//                parent.setRight(null);
//            }
//        } else if (child.getLeft() != null) {
//            if (parent==null) {
//                root = child.getLeft();
//            } else if () {
//
//            }
//        }
//    }
}
