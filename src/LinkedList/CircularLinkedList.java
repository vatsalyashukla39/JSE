package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList(Node head) {
        this.head = head;
    }
    public  void  append(int x){
        Node p;
        p=new Node(x);
        if (head==null){
            head=p;
            tail=head;
            tail.setNext(head);
            head.setNext(head);
            return;
        }tail.setNext(p);
        tail=p;
    tail.setNext(head);}
    public void printList(){
        if (head==null){
            System.out.println("list empty");return;}
        Node temp=head;
        do{
            System.out.println(temp.getData());
            temp=temp.getNext();}
        while(temp!=head);
    }
    public void prepend(int x){
        Node p;
        p=new Node(x);
        if (head==null){
            head=p;
            tail=head;
            tail.setNext(head);
            head.setNext(head);
            return;
        }head=p;
        p.setNext(tail.getNext());
        tail.setNext(p);
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        tail.setNext(head.getNext());
        head=head.getNext();
    }
    public void removeLast(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        if (head==tail){
            head=tail=null;
            return;
        }
        Node temp=head;
        while (temp.getNext().getNext()!=head){
            temp=temp.getNext();
        }
        temp.setNext(head);
    }
    public void remove(int x){
        if(head==null){
            System.out.println("list empty");
            return ;
        }
        if (head.getData()==x){
            if (head==tail){
            head=tail=null;
            return;}
            tail.setNext(head.getNext());
            head=head.getNext();
            return;
        }
        Node temp=head.getNext();
        Node prev=head;
        while (temp!=head){
            if (temp.getData()==x){
                prev.setNext(temp.getNext());
                return;
            }
            prev=temp;
            temp=temp.getNext();
        }
        System.out.println("no not found");
    }
}
