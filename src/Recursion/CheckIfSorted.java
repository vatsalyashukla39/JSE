package Recursion;

public class CheckIfSorted {
    public static void main(String[] args) {
        int []arr={1,2};
        System.out.println(check(arr));
    }
    static boolean check(int []arr){
        return helper(arr,0);
    }
    static boolean helper(int [] arr,int n){
        if(n== arr.length-1)
            return true;
//        else if (arr[n] <= arr[n + 1]) {
//            return helper(arr,n+1);
//        }
        else return arr[n]<arr[n+1]&&helper(arr,n+1);

    }
}
