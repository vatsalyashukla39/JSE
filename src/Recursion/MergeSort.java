package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={3,6,1,9,2,89,21,43,34};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int [] sort(int []arr){
        if (arr.length==1)return arr;
        int mid= arr.length/2;
        int [] left=sort(Arrays.copyOfRange(arr,0,mid));
        int []right=sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int [] merge(int [] left,int [] right){
        int [] arr=new int [left.length+ right.length];
        int i=0,j=0,k=0;
        while (i!= arr.length){
            if (j== left.length){
                for (; i < arr.length; i++) {
                    arr[i]=right[k];
                    k++;
                }}
            else if (k== right.length){
                for (; i < arr.length; i++) {
                    arr[i]=left[j];
                    j++;
                    }
            }
            else {
                if (left[j]<right[k]){
                    arr[i]=left[j];
                    j++;i++;
                }
                else if (left[j]>right[k]){
                    arr[i]=right[k];
                    k++;i++;}
                else {
                    arr[i]=left[j];
                    j++;i++;
                    arr[i]=right[k];
                    k++;i++;
                }
                }
        }return arr;
    }
}
