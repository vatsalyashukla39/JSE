package Recursion;
import java.util.*;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
    public static int numSquares(int n) {
        do{
            find("",n);
        }
        while(!li.get(li.size()-1).isEmpty());
        return li.get(li.size()-2).length();
    }
    static List<String> li=new ArrayList<>();
    static boolean check(int n){
        return Math.sqrt(n)==Math.floor(Math.sqrt(n));
    }
    static void find(String p,int n){
        if(n==0&&li.size()!=0){
            if(p.length()<=li.get(li.size()-1).length()){
                li.add(p);
                return;
            }
            else{li.add("");return;}}
        if(n==0&&li.size()==0){
            li.add(p);
            return;}

        int i=0;
        while(!check(n-i)&&i<=n&&(li.size()==0||li.get(li.size()-1).charAt(0)-'0'==(n-i))){
            i++;
        }find(p+(n-i),i);
    }
}
