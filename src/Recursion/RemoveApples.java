package Recursion;

import java.util.Scanner;

public class RemoveApples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();remove(str);
        str.matches("app");
        str.replace(str.charAt(5),Character.MIN_VALUE);
        System.out.println();

    }
    static void remove(String s){
        s.replaceAll("apples","");
    }
}
