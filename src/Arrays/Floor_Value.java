package Arrays;

public class Floor_Value {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        System.out.println(binarySearch(arr,15));
    }
    static int binarySearch(int []arr,int target){
        int start= 0;
        int end= arr.length-1;
        int mid=start+(end-start)/2;
        int count =0;

        if (arr[0]<arr[arr.length-1]){
            while (start<=end){
                if (target>arr[mid])
                    start=mid+1;
                else if (target < arr[mid])
                    end=mid-1;
                else
                    return arr[mid];
                mid=start+(end-start)/2;
            }count++;

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
        if (count==0)
            return arr[mid];
        else
            return arr[mid-1];
    }

}
