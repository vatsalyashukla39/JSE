package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={3,6,1,9,2,89,21,43,34};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
       // helper(arr,arr.length-1);
        helper1(arr, arr.length,0,0);
    }
    static void helper(int[]arr,int e){
        if(e==0)
            return;
        int m=Integer.MIN_VALUE;
        int in=-1;
        for (int i = 0; i <=e; i++) {
            if (arr[i]>=m){
                m=arr[i];
                in=i;}
        }
        arr[in]=arr[e];
        arr[e]=m;
        helper(arr, e-1);
    }
    static void helper1(int[]arr,int r,int c,int max){
        if (r==0)
            return;
        if (c<r){
            if (arr[c]>arr[max])
                helper1(arr, r, c+1, c);
            else helper1(arr,r,c+1,max);
        }
        else {
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            helper1(arr, r-1, 0, 0);
        }
    }
}
