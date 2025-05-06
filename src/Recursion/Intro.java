package Recursion;

public class Intro {
    public static void main(String[] args) {
        message(1);

    }
    static void message(int n){
         if (n==5){
        System.out.println(5);
        System.exit(0);}
        System.out.println(n);
        message(n+1);
    }
}
