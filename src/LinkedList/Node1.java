package LinkedList;

public class Node1 {
    int data;
    Node1 next;
}
class Test{
    public static void main(String[] args) {
        Node1 first;
        first=new Node1();
        first.data=10;

        Node1 sec=new Node1();
        sec.data=20;
        first.next=sec;

        Node1 third=new Node1();
        third.data=30;
        sec.next=third;
        Node1 temp;
        temp=first;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
