package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
       rev(12345);
        System.out.println(sum);
        System.out.println(rev1(1234567,0));
        System.out.println(helper(123219));
    }
     static int sum=0;
    static void rev(int n){
        if(n==0) return;
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
    }
    static int rev1(int n,int m){
        if (n!=0){
            m=10*m+n%10;
            return rev1(n/10,m);
        }return m;
    }
    static boolean helper(int n){
        return n==rev1(n,0);
    }
}
