package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceSum {
    public static void main(String[] args) {
String s="2345";
int a=Integer.valueOf(s);
        System.out.println(a+2);
    }
//    static List<String> ans(String p,int up){
//        if (up==0){
//            List<String>l1=new ArrayList<>();
//            l1.add(p);
//            return l1;
//        }
//        List<String>li =new ArrayList<>();
//        for (int i = 1; i <=4 ; i++) {
//            f
//        }
   // }
      static void ans1(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6&&i<=target ; i++) {
            ans1(p+i,target-i);
          }

      }
}
