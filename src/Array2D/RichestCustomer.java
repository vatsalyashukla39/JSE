package Array2D;
import java.util.*;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomer {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number of people : ");
        int r= in.nextInt();
        System.out.print("Enter the number of accounts per person : ");
        int c= in.nextInt();
        int [][] arr=new int[r][c];
        for (int i = 1; i <= r; i++) {
            System.out.println("Enter the amount in the account of person "+i);
            for (int j = 0; j < c; j++) {
                arr[i-1][j]= in.nextInt();
            }
        }
        System.out.println("The wealth of richest person is : "+ maximumWealth(arr));}
    static int maximumWealth(int[][] accounts) {
        int s; int m=Integer.MIN_VALUE;
        for(int[]x:accounts){
            s=0;
            for(int y:x){
                s+=y;
            }
            if(s>m)
                m=s;

        }

        return m;}
}
