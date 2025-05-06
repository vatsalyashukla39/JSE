package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={9,2,4,1,7,3,4,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,6));
    }
    static int search(int []arr,int n){
        return helper(arr,n,0);
    }
    static int  helper(int []arr, int n, int c){
        if (c == arr.length)
            return c;
        else if(arr[c]==n)
            return c;
         else return helper(arr, n, c+1);
    }
}
