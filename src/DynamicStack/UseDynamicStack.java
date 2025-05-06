package DynamicStack;

import com.sun.source.tree.Tree;

public class UseDynamicStack {
    public static void main(String[] args) {
        DynamicStack ds = new DynamicStack();
        ds.push(1);
        ds.push(2);
        ds.push(3);
        ds.push(4);
        ds.push(5);
        ds.peek();
        ds.pop();
        ds.peek();


    }
}
