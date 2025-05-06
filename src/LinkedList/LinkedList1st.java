package LinkedList;

public class LinkedList1st {
    private Node head;
    private Node tail;

    public LinkedList1st(Node head) {
        this.head = head;
    }
    public  void  append(int x){
        Node p;
        p=new Node(x);
        if (head==null){
            head=p;
            tail=head;
            return;
        }tail.setNext(p);
        tail=p;
          //Node temp;
//        temp=head;
//        while (temp.getNext()!=null){
//            temp=temp.getNext();
//        }temp.setNext(p);
    }
    public void printList(){
        if (head==null)
            return;
        Node temp;
        temp=head;
        while (temp!=null){
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }

    }
    public int count(){
        int c=0;
         Node temp;
            temp=head;
            while (temp!=null){
                ++c;
                temp=temp.getNext();
            }
        return c;
    }
    public int search(int n){
        if(head==null)
            return 0;
        Node temp;
        temp=head;
        int c=1;
        while (temp!=null){
            if (temp.getData()==n)
                return c;
            c++;
            temp=temp.getNext();
        }return -1;
    }
    public void prepend(int x){
        Node p;
        p=new Node(x);
        p.setNext(head);
        head=p;
        System.out.println(head.getData());
        Node g=head.getNext();
        System.out.println(g.getData());}
    public void insert(int x){
        Node p;
        p=new Node(x);
        if (head==null){
            head=p;
            tail=head;
            return;
        }
        if (x>=tail.getData()){
            tail.setNext(p);
        tail=p;
        }
        else if (x<head.getData()) {
            p.setNext(head);
            head=p;
        }
        else {
            Node temp=head;
            while(true){
                if(x>=temp.getData()&&x<=temp.getNext().getData()){
                    p.setNext(temp.getNext());
                    temp.setNext(p);
                    p.setData(x);
                    return;
                }
                temp=temp.getNext();
            }
        }
    }
    public void reversePrintList(){
        helper(head);
    }
    public void helper(Node temp){
        if(temp.getNext()==null) {
            System.out.print(temp.getData()+"-->");
            return;
        }
        helper(temp.getNext());
        System.out.print(temp.getData()+"-->");
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("list empty");}
        else {
            head=head.getNext();
        }
    }
    public void deletelast(){
        if (head==null){
            System.out.println("list empty");
        }
        else{tail=null;
            Node temp;
            temp=head;
            if (temp.getNext()==null){
                head=null;
                return;}
        while(temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }temp.setNext(null);
        }
    }
    public void deleteAny(int x){
        if (head==null){
            System.out.println("list empty");
        }
        else if (head.getData()==x){
            head=head.getNext();
        }
        else if (tail.getData()==x){

        }
        else{
            Node temp;
            temp=head;
            if (temp.getNext()==null){
                head=null;
                return;}
            while(temp.getNext().getNext()!=null){
                temp=temp.getNext();
            }temp.setNext(null);
        }
    }
    public void addAtPos(int x,int i){
        if(i<0||i>x){
            System.out.println("wrong i");
            return;
        }
        int c=0;
        Node temp;
        temp=head;
        if (temp.getNext()==null&&i==0){
            //setData(x);
            return;}
        while(temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }temp.setNext(null);
    }
        public void reverseList(){
            if (head==null){
                System.out.println("list empty");
            return;}
            if (head==tail){
                return;
            }
            Node prev=head;
            Node temp=head.getNext();
            prev.setNext(null);
            head=tail;
            tail=prev;
            while (temp!=null){
                Node t=temp.getNext();
                temp.setNext(prev);
                prev=temp;
                temp=t;
            }
        }
        public void delIthLastNode(int index){
            if (index<=0||index>count()){
                System.out.println("wrong index");
                return;
            }
            if (count()-index==0){
                head=head.getNext();
                return;
            }
            Node temp=head;
            int count=1;
            while (count!=count()-index){
                temp=temp.getNext();
                count++;
            }temp.setNext(temp.getNext().getNext());
        }
        //insert using recursion
        public void insertRec(int data,int index){
        if (index<0||index>count()){
            System.out.println("wrong index");
            return;
        }Node newNode=new Node(data);
        if (index==0){
            newNode.setNext(head);
            head=newNode;
            return;
        }
        Node temp=head;
        helperRec(data,index,temp,newNode,0);
        }
        private void helperRec(int data,int index,Node temp,Node newNode,int count){
        if (index==count+1){
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            return;
        }
        helperRec(data,index,temp.getNext(),newNode,count+1);
        }
    }

