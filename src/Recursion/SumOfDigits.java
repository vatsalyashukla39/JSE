package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(505));
        exp(5);
    }
    static int sum(int n){
        if(n!=0)
        return (n%10)+sum(n/10);
        else return 0;
    }
    static void exp(int n){
        if (n==0)
            return;
        System.out.println(n);
        exp(--n);
    }
}
