package Recursion;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibo(4));
    }



    public static int fibo(int n){
        if(n<2)
        return n;
        return fibo(n-1)+fibo(n-2);
    }
}
//20 19 9 8 4 3 1
//96 97 108 98 109 99 110 100 111 101 91
