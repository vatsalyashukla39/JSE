package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subseq {
    public static void main(String[] args) {
        System.out.println(findSubsets1("","abc"));

    }

    static void findSubsets(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        else {
            char ch=up.charAt(0);
            findSubsets(p+ch,up.substring(1));
            findSubsets(p,up.substring(1));
        }
    }
    static List<String> findSubsets1(String p,String up){
        if (up.isEmpty()){
            List<String> li=new ArrayList<>();
            li.add(p);
            return li;
        }

            char ch=up.charAt(0);
            List<String> l=findSubsets1(p+ch,up.substring(1));
            List<String> r=findSubsets1(p,up.substring(1));
            l.addAll(r);
            return l;
    }

}
