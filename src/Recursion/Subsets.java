package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] arr= {2,1,2};
        List<List<Integer>> ans=findSubsets(arr);
        System.out.println(ans);
    }
    static List<List<Integer>> findSubsets(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr){
            int n= outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                if (outer.indexOf(internal)==-1)
                outer.add(internal);
            }
        }return outer;
    }
}
