package Array2D;
import java.util.*;
public class Salesman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many salesman do you have? ");
        int n= sc.nextInt(),v;
        int [][]arr =new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of sales of salesman "+(i+1));
            v= sc.nextInt();
            arr[i]=new int[v];
            System.out.println("Enter sales values:");
            for (int j = 0; j < v; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Average sales of salesman "+(i+1)+" : ");
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.println((double)sum/arr[i].length);
            if (sum>=max)
                max=sum;
        }
    int s=0,i;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                s+=arr[i][j];
            }if (s==max)
                break;
        }
        System.out.println("Best salesman is : "+i);
    }
}
