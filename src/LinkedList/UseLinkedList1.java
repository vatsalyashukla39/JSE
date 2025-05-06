package LinkedList;

public class UseLinkedList1 {
    public static void main(String[] args) {
//        Node h=null;
//        LinkedList1st obj=new LinkedList1st(h);
//        obj.insert(110);
//        obj.insert(20);
//        obj.insert(300);
//        obj.insert(700);
//        obj.insert(750);
//        obj.insert(756);
//        obj.insert(670);
//        obj.insert(900);
//        obj.insert(0);
//        obj.printList();
//        obj.deletelast();
        //obj.reversePrintList();
//        System.out.println();
//        System.out.println(obj.search(8));
//        System.out.println("total no.of nodes = "+obj.count());
        //obj.prepend(42);
        Node h=null;
        LinkedList1st c=new LinkedList1st(h);
        c.append(10);
        c.append(20);
        c.append(30);
        c.append(40);
        c.append(50);
        c.printList();
        System.out.println();
        c.insertRec(56,5);
        c.printList();
        System.out.println();
        c.insertRec(25,2);
        c.printList();



    }

}
