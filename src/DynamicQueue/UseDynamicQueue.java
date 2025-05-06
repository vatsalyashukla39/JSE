package DynamicQueue;

public class UseDynamicQueue {
    public static void main(String[] args) {
        DynamicQueue dq = new DynamicQueue();
        dq.enqueue(1);
        dq.enqueue(2);
        dq.enqueue(3);
        dq.enqueue(4);
        dq.dequeue();
        dq.dequeue();
        dq.dequeue();
        dq.dequeue();

    }
}
