package Recursion;

import java.awt.image.RasterOp;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={3,6,1,9,2,89,21,43,34};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        helper(arr,arr.length-1,0);
    }
    static void helper(int[]arr,int l,int f){
        if (l==0)
            return;
        if (f < l) {
            if (arr[f]>arr[f+1]){
                int temp=arr[f];
                arr[f]=arr[f+1];
                arr[f+1]=temp;
            }
            helper(arr, l, f+1);
        }
        else helper(arr, l-1, 0);
    }
}

