package Arrays;

import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder builder=new StringBuilder();
        System.out.println(builder.append(str).reverse());

    }
    public static boolean pallindrome(String str){
        StringBuilder builder=new StringBuilder();
        builder.append(str);
        StringBuilder builder1=new StringBuilder();
        builder1.append(builder.reverse());
        return str.equals(builder1.reverse());
    }
    public static void fibonacci(int n){
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a+b);
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
