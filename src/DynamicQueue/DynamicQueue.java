package DynamicQueue;

public class DynamicQueue {
    private Node front, rear;
    public DynamicQueue() {
        front=rear=null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(front==null)
            front=newNode;
        else rear.setNext(newNode);
        rear=newNode;
        System.out.println("Enqueued data: "+data);
    }
    public int dequeue() {
        if(front==null)
            throw new QueueException("Queue underflow");
        int data=front.getData();
        front=front.getNext();
        if(front==null)
            rear=null;
        return data;
    }
    public int peek() {
        if (front==null)
            throw new QueueException("Queue underflow");
        return front.getData();
    }
}
