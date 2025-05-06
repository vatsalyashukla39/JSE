package Recursion;

public class CountZeros {
    public static void main(String[] args) {
count(10203,0);
    }
    static void count(int n,int m){
        if (n!=0){
            if (n%10==0)
                m++;
            count(n/10,m);
        }
        System.out.println(m);
        System.exit(0);

    }
}
