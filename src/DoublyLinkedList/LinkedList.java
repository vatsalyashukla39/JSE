package DoublyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    public LinkedList() {
        head = null;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
//        Node current = head;
//        while (current.getNext() != null) {
//            current = current.getNext();
//        }
//        current.setNext(newNode);
//        newNode.setPrev(current);
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;

    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Printing List in forward direction");
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + "-->");
            current = current.getNext();
        }current = tail;
        System.out.println("\nPrinting List in backward direction");
        while (current != null) {
            System.out.print(current.getData() + "-->");
            current = current.getPrev();
        }
    }
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        head.setPrev(newNode);
    }
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head==tail) {
            head = tail = null;
            return;
        }
        head = head.getNext();
        head.setPrev(null);
    }
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        }
        tail = tail.getPrev();
        tail.setNext(null);
    }
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.getData() == data) {
            removeFirst();
            return;
        }
        if (tail.getData() == data) {
            removeLast();
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getData() == data) {
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
                return;
            }
            current = current.getNext();
        }
        System.out.println("Element not found");
    }

}
