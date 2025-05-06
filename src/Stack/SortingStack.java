package Stack;

import java.util.*;

public class SortingStack {
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<>();
            s1.push(9);
            s1.push(2);
            s1.push(8);
            s1.push(45);
            s1.push(7);
            sort(s1);
        s1.forEach(n->{
            System.out.println(n);
        });
    }
    public static void sort(Stack<Integer> s1){
        Stack <Integer> s2=new Stack<>();
       while(!s1.isEmpty()){
           int x=s1.pop();
//           if(s2.isEmpty())
//               s2.push(x);
           //else{
               while(!s2.isEmpty()&&s2.peek()>x){
                   s1.push(s2.pop());
               }
               s2.push(x);
           //}
       }
       while (!s2.isEmpty()){
           s1.push(s2.pop());
       }
    }
}
