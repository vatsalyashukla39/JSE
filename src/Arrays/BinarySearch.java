package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        System.out.println(binarySearch(arr,15));
    }
    static int binarySearch(int []arr,int target){
        int start= 0;
        int end= arr.length-1;
        int mid=start+(end-start)/2;

      StringBuilder sb=new StringBuilder();
      sb.append(arr[mid]);
        if (arr[0]<arr[arr.length-1]){
        while (start<=end){
            if (target>arr[mid])
                start=mid+1;
            else if (target < arr[mid])
                end=mid-1;
            else
                return arr[mid];
            mid=start+(end-start)/2;
        }

    }
        else {
            while (start<=end){
                if (target>arr[mid])
                    end=mid-1;
                else if (target < arr[mid])
                    start=mid+1;
                else
                    return arr[mid];
                mid=start+(end-start)/2;
            }
        }

    return -1;
    }
}
