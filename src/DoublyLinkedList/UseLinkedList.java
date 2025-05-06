package DoublyLinkedList;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 10; i < 60; i=i+10) {
            list.append(i);
        }
        list.printList();
    }
}
