package Recursion;

public class PrintN {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
       if(n!=0) System.out.println(n);

        if(n==0){

            return;
        }
        else {
            print(n-1);
        } System.out.println(n);
    }
}
