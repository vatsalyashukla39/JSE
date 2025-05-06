package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class RangeOfItem {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

       searchRange(arr,11);
    }


 public static int[] searchRange(int[] nums, int target) {
//        int s = 0, e = nums.length - 1, mid = s + (e - s) / 2;
//        while (nums[s] != target && nums[e] != target && s <= e) {
//            mid = s + (e - s) / 2;
//            if (nums[mid] > target)
//                e = mid - 1;
//            else if (nums[mid] < target)
//                s = mid + 1;
//            else
//                break;
//        }
//        if (nums[mid] == target) {
//            int c0 = 0, c3 = 0;
//            for (int i = mid + 1; i <= e; i++) {
//                if (nums[i] != target)
//                    break;
//                c0++;
//            }
//            for (int i = mid - 1; i >= s; i--) {
//                if (nums[i] != target)
//                    break;
//                c3++;
//            }
//            return new int[]{mid - c3, mid + c0};
//        } else if (nums[s] == target) {
//            int c1 = 0;
//            for (int i = s + 1; i <= e; i++) {
//                if (nums[i] != target)
//                    break;
//                c1++;
//            }
//            return new int[]{s, s + c1};
//        } else if (nums[e] == target) {
//            int c2 = 0;
//            for (int i = e - 1; i >= s; i--) {
//                if (nums[i] != target)
//                    break;
//                c2++;
//            }
//            return new int[]{e - c2, e};
//        }
//        return new int[]{-1, -1};
//    }
//}
        //OPTIMIZED APPROACH
    int[]ans ={-1,-1};
    int start =search(nums,target,true);
        int end =search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
    return ans;}
    static int search(int[] nums,int target, boolean findstartindex){
        int ans=-1;
        int start =0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<nums[mid])
                end=mid-1;
            else if (target > nums[mid])
                start=mid+1;
            else {
                ans=mid;
                if (findstartindex)
                    end=mid-1;
                else
                    start=mid+1;
            }

        }
   return ans; }

}















