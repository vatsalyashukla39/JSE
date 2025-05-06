package Array2D;

import java.util.*;
public class SumandMean {
    //RECTANGULAR ARRAY
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows and columns :");
//        int row = sc.nextInt(), col = sc.nextInt();
//        int [][] arr =new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++)
//                arr[i][j]= sc.nextInt();
//        }int sum=0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                sum+=arr[i][j];
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("sum =  "+sum);
//        System.out.println("mean = "+(double)sum/(row*col));
//    }

    //JAGGED ARRAY
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of rows & columns :");
//        int row = sc.nextInt();
//        int col= sc.nextInt();
//        int [][] arr= new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//
//    }


    //TRYING WITH FOREACH

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & columns :");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                arr[i][j] = sc.nextInt();
        }
        for (int[] x :arr) {
            for (int y :x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}