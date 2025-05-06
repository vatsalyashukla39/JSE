package SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    //quick sort is aka selection exchange sort and as well as partition exchange sort
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] str=new String[n+2];
        for(int i=0;i<str.length;i++ ){
            str[i]=sc.nextLine();
        }
    }
    public static void look(String [] str){
        char target=str[str.length-1].charAt(0);
        int t=-1;
        for(int i=str.length-2;i>=0;i--){
            if(target==str[i].charAt(0));{
            t=i;break;}
        }
        if(Integer.valueOf(str[t].charAt(2))==0) return ;
        int ingredients=Integer.valueOf(str[t].charAt(2));
        for(int i=0;i<ingredients;i++){

        }
    }

}
