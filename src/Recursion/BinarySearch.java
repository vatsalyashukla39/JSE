package Recursion;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5,6,7,8};
String s="567";

        System.out.println(s.toUpperCase());


        System.out.println(search(nums,3,0, nums.length-1));

    }
        static int search(int [] arr,int target,int s,int e) {
            if (s > e)
                return -1;
            int mid = s + (e - s) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                return search(arr, target, mid + 1, e);
            else return search(arr, target, s, mid - 1);
        }}
//#Complexity of binary search:
//        1)Binary search starts by dividing the array into 2 halves.
//2)So on step 1 the search space becomes n/2 on step 2 it becomes n/4 this goes on till the search space becomes 1. This means
//that if the array length is n then the number of steps will be k=log(n) so     `