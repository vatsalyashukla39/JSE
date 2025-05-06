package Bitwise;

import java.util.Arrays;

public class FindSingleNumber {
    public static void main(String[] args) {
        int []arr ={2,3,4,1,2,1,6,4,6};
        System.out.println(findSingle(arr));
        int a=12345678;
      String str=String.valueOf(a);
        Integer str1 =Integer.valueOf(String.valueOf(str.split("")));
        System.out.println (  str1);
    }
    static int findSingle(int []arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1])
                i++;
            else return arr[i];
        }
        return arr[arr.length-1];
    }
}
