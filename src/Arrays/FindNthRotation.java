package Arrays;

public class FindNthRotation {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        String [] brr={"1234567yiu","09876re"};
        System.out.println(brr[1].charAt(2));
        System.out.println(Rotation(arr));
    }
    public static int Rotation(int[]arr){
        int index=0,start=0,end= arr.length-1;
        if (arr[start]<arr[end])
            return index;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                return mid+1;
            else if (arr[mid]>arr[start])
                start =mid;
            else
                end=mid;

        }
        return index;

    }
}
