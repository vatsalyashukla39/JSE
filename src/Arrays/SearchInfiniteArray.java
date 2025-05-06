package Arrays;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        search(arr,11);
    }
    static void search(int[] arr,int target){
        int start=0,key=-1;
        int end =1;
        while(arr[end]<target){
            start=end+1;
            end*=2;}
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(target>arr[mid])
                start=mid+1;
            else if(target<arr[mid])
                end=mid-1;
            else{
                key =mid;
                break;}

        }
        System.out.println(key);}}


