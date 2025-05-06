package Array2D;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int [][]arr ={
                {10,20,30},
                {24,26,29},
                {34,35,38}};
        int [] brr=search(arr,34);
        System.out.println(Arrays.toString(brr));
    }





    static  int[] search(int[][] matrix, int target){
        int r=0; int c= matrix.length-1;
        while (r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int []{r,c};
            }
            if (matrix [r][c]<target ){
                r++;
            } else c--;
        }
    return new int[]{-1,-1};

}
}