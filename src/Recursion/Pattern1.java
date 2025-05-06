package Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if (n==0)
            return;
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        print(n-1);
    }
}
