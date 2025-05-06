package SortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            int temp;
            temp=arr[last];
            arr[last]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
    }
    static int getMaxIndex(int [] arr,int start,int last){
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for (int i = 0; i <= last; i++) {
            if (arr[i]>max){
            maxIndex=i;
            max=arr[i];}

        }return maxIndex;
  }
}
