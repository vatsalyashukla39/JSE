package Arrays;
import java.util.*;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits1259Leetcode {
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        System.out.print("Enter the  size of array : ");
//        int n= in.nextInt();
//        int [] arr=new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]= in.nextInt();
//        }
//        System.out.println("The numbers consisting of even digits in our array : "+EvenDigits(arr));
//    }
//
//    static int EvenDigits(int[]arr){
//        int number=0;
//        for (int i = 0; i < arr.length; i++) {
//            int count=1;
//            if (arr[i]<0)
//                arr[i]*=-1;
//            while (arr[i]>10){
//                arr[i]=arr[i]/10;
//                count++;
//            }
//            if (count%2==0)
//                number++;
//        }
//   return number; }

    //OPTIMIZED APPROACH
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the  size of array : ");
        int n= in.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println("The numbers consisting of even digits in our array : "+EvenDigits(arr));
    }

    static int EvenDigits(int[]arr){
        int number=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0)
                arr[i]*=-1;
            int  count=(int)(Math.log10(arr[i]))+1;
            if (count%2==0)
                number++;
        }
        return number; }
}
