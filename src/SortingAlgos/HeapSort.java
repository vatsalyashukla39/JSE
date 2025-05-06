package SortingAlgos;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int [] arr= {0,12,5,15,8,90,23,45,11};
       // System.out.println("Unsorted Array");
        for (int i = 1; i < arr.length ; i++) {
            insertHeap(arr,i,arr[i]);
        }
        System.out.println(Arrays.toString(arr));


    }
    public static void insertHeap(int[] arr, int index, int value) {
        int temp = arr[index];
        int parent = (index) / 2;
        if (index==1){arr[index] = value;return;}
        while (index >1 && arr[parent] < arr[index]) {
            arr[index]=arr[parent];
            arr[parent]=value;
            index=parent;
            parent=parent/2;
        }
    }
    public static int delHeap(int[] arr) {
        int top=arr[1];
        int n=arr.length-1;
        arr[1]=arr[arr.length-1];
        n--;
        int i=1, j=2*i;
        while(j<=n){
            if(i<n){
                if(arr[j]<arr[j+1]){j++;}
            }

        if(arr[i]<arr[j]){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=j;
            i=2*i;
        }
        else{ break;}}
        return top;
    }
}
