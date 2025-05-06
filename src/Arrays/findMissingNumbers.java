package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMissingNumbers {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7}; int k=3;
        //System.out.println(missingNumbers(arr));
        int[] arr=new int [nums.length];
        for(int i=0;i<k;i++){
            arr[i]=nums[nums.length+i-k];
        }
        for(int i=0;i<nums.length-k;i++){
            arr[k+i]=nums[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}

 //   }
//    static List<Integer> missingNumbers(int [] arr) {
//        List<Integer> missed = new ArrayList<>();
//        int[] brr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            brr[arr[i] - 1] = arr[i];
//        }
//        for (int i = 0; i < brr.length; i++) {
//            if (brr[i] == 0) {
//                missed.add(i + 1);
//            }
//        }
//        return missed;
//    }

//}
