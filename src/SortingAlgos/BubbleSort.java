package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        //run the steps n-1 times
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            //for each step max item will come at the last respective index
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if ypu did not swap for a particular value of i,it means the array is sorted hence stop the program
            if(!swapped)
                break;
        }
    }
}
//Complexity of sorting algorithms is counted by counting the number of comparisons done by the inner loop
//2)In bubble sort the inner loop on the first pass will run n-1 times and will set one element at it's correct position
//3)On 2nd pass the inner loop will run n-2 times and will set two elements in their correct position
//Can we improve the time complexity of bubble sort?
//Yes bubble sort will the complexity of n^2 even if the array is already sorted
//We can improve this by checking whether swapping took place or not in a particular pass if not then it means
//array has been sorted. In this case complexity will be o(n).
