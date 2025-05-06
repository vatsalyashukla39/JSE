package Bitwise;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(55));
        System.out.println(434991989/8);
        int n=434991989/8;
        System.out.println(n*8);
        String s="345678";
        int a=2;
        String s5="2563";
        System.out.println(Integer.valueOf(s5)+2);
        System.out.println('a'>57);
        int b=s.charAt(s.length()-1)-'0';
        System.out.println(b);
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        List<Integer> li=new ArrayList<>();
        li.addAll(l);
        System.out.println(li);
        //l.addAll(li);
        System.out.println(l);
        for (int i = 0; i < 1; i++) {
            Collections.reverse(l);
            System.out.println(l);

        }l.removeAll(l);
        int []arr={1,2,3,4};
        List lg=Arrays.asList(arr);
        System.out.println(lg);
        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

        // Conversion of array to ArrayList
        // using Arrays.asList
        List al = Arrays.asList(geeks);

        System.out.println(al);
        double ng=Math.sqrt(49);
        System.out.println("dfgh"+34);
        System.out.println(Math.floor(ng)-ng==0);

    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
