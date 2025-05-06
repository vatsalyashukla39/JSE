package Arrays;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,12,11,10,9,8,7,6,5,4,3,2,1};
        sWap(arr,0,1);
    }

    static void sWap(int[] arr,int x,int y) {

       int temp=arr[y];
        arr[y]=arr[x];
        arr[x]=temp;
        System.out.println(Arrays.toString(arr));}}

