package Loops;

import java.util.*;

//public class SwapAlt {
//    public static void main(String[] args) {
//        int [] arr={8,3,4,9,2,5,6,7,9};
//        int max=Integer.MIN_VALUE;
//
//    sWap(arr);}
//    public static void sWap(int [] arr){
//        for (int i = 0; i < arr.length - 1; i=i+2) {
//            int temp=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}
public class SwapAlt{
private static Map<String, List<List<String>>> rb =new HashMap<>();
private  static Map<String ,Integer>memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            String line= sc.nextLine();
            String [] parts = line.split(" ");
            String potion= parts[0];
            String[]ingredients= parts[1].split("\\");

        }
    }
}