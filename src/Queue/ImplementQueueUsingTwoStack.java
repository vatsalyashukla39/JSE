package Queue;

import java.util.Stack;

public class ImplementQueueUsingTwoStack {
    class Queue{
        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public Queue(){
            s1=new Stack<>();
            s2=new Stack<>();

        }
        public void Enqueue(int x){
            s1.push(x);
        }
        public int Dequeue(){
            if(s1.isEmpty()){
                throw  new RuntimeException("Queue underflow");
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int x=s2.pop();
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }return x;
        }
    }
    class UseQueue{
        public static void main(String[] args) {

        }
    }
}
