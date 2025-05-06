package Arrays;
import java.util.*;
public class MaximumItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(print2largest(arr, n));
    }

    //   static void Maximum(int[] arr) {
    //     int Max=Integer.MIN_VALUE;
    //    for (int x :arr) {
    //      if (x>Max)
    //          Max=x;
    //}
    // System.out.println(Max);
    static int print2largest(int arr[], int n) {
        int L = Integer.MIN_VALUE;
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > L)
                L = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]>l&&arr[i]<L)
                l=arr[i];
        }
    if (l==L)
    return -1;
    else
    return l;}
}
