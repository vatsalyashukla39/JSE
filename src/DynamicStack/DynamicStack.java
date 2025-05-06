package DynamicStack;

public class DynamicStack {
    private Node tos;
    public DynamicStack() {
        this.tos = null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(tos);
        tos = newNode;
        System.out.println("Pushed: " + data);
    }
    public int pop() {
        if (tos == null){
            throw new StackException("StackUnderflow");
        }
        int data = tos.getData();
        tos = tos.getNext();
        return data;
    }
    public int peek() {
        if (tos == null){
            throw new StackException("StackUnderflow");
        }
        return tos.getData();
    }
    public boolean isEmpty() {
        return tos == null;
    }
}
