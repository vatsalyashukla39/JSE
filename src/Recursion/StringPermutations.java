//package Recursion;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class StringPermutations {
//    public static void main(String[] args) {
//    //    System.out.println(permut2("","acc"));
//        int []arr={3,5,6,8,9,7};
//        //List<Integer> l9=Arrays.stream(Arrays.copyOfRange(arr,0,2)).boxed().toList();
////l9.add(arr[0]);
//  //      System.out.println(l9);
//        String sz="6783223";
//        StringBuilder sb=new StringBuilder();
//        sb.append("fghj");
//        sb.replace(0,sb.length(),sz);
//        System.out.println(sb);
//sz.contains()
//    }
//    static void permut(String p,String up){
//        if(up.isEmpty())System.out.print(p+" ");
//        else {
//            char ch=up.charAt(0);
//            for (int i = 0; i <= p.length(); i++) {
//                String f=p.substring(0,i);
//                String s=p.substring(i);
//                permut(f+ch+s,up.substring(1));
//            }
//        }
//    }
//    static List<String> permut1(String p, String up){
//        if(up.isEmpty()){
//            List<String>l=new ArrayList<>();
//            l.add(p);
//            return l;
//        }
//
//            List<String> li=new ArrayList<>();
//            char ch=up.charAt(0);
//            for (int i = 0; i <= p.length(); i++) {
//                String f=p.substring(0,i);
//                String s=p.substring(i);
//                li.addAll(permut1(f+ch+s,up.substring(1)));
//        }return li;
//    }
//    static int permut2(String p,String up){
//        if(up.isEmpty())return 1;
//            int c=0;
//            char ch=up.charAt(0);
//            for (int i = 0; i <= p.length(); i++) {
//                String f=p.substring(0,i);
//                String s=p.substring(i);
//                c+=permut2(f + ch + s, up.substring(1));
//            }return c;
//        }
//}
