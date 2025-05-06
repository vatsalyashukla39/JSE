package Recursion;

public class CountSteps {
    public static void main(String[] args) {
        System.out.println(count(14));
        System.out.println(7/3);
    }
    static int count(int num){
        return helper(num,0);
    }
    static int helper(int num,int steps){
        if (num==0)
        return steps;
        else if (num % 2 == 0) {
            return helper(num/2,steps+1);
        }
        else return helper(num-1,steps+1);
    }
}
