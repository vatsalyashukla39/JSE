package Arrays;
import java.util.*;


public class SumandAverage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int sum=0;
        int arr []=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]= sc.nextInt();
        for (int x :arr) {
            sum+=x;
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println("mean = "+(double)sum/n);

    }
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();double Sum=0;
        for (int i = n; i >=1 ; i--) {
            int fact=1;
            for (int j = i; j >=1 ; j--) {
                fact=fact*j;

            }
            if (i%2==0)
            Sum+=(Math.pow(i,i)/fact);
            else
                Sum-=(Math.pow(i,i)/fact);

        }
        System.out.println(Sum);
    }*/
}
