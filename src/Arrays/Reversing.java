package Arrays;

import java.util.Arrays;

public class Reversing {
    public static void main(String[] args) {
        int [] arr ={12,45,65,13,78,94,62,44,35};
        Reverse(arr);
    }

     static void Reverse(int[] arr) {
        int temp =0;
        for (int i = 0; i < arr.length/2; i++) {
             temp=arr[i];
             arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
         }
         System.out.println(Arrays.toString(arr));
    }
}






