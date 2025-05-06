package Recursion;

import java.util.Scanner;

public class Removeas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println(remove(str));
    }
    static String remove(String s){
        StringBuilder s1=new StringBuilder();
        return helper(s,s1,0);
    }
    static String helper(String s,StringBuilder s1,int i){
        if (!s.contains("a"))return s;
        if (i==s.length())return String.valueOf(s1);
        else if (s.charAt(i)!='a') {
            s1.append(s.charAt(i));
            return helper(s,s1,i+1);
        }
        else  return helper(s,s1,i+1);
    }
}
