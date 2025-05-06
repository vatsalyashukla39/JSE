package Arrays;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/
public class PeakIndex {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,3,4,5,6,7,8,9,10,11};
        System.out.println(findPeakIndex(arr));
    }
    public static int findPeakIndex(int[] arr) {

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end=mid-1;
            else
                start=mid+1;




        } return start;
    }
}
