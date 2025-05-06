package Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class NambiarNumber {
    public static void main(String[] args) {
        System.out.println(nambiar("9880127431"));
    }
    public static String nambiar(String n){


        int[] nums = new int[n.length()];

        for (int i = 0; i < n.length(); i++){
            nums[i] = n.charAt(i) - '0';
        }
        List<Double> li=new ArrayList<>();
        int i=0;

        while (i<nums.length){
            int j=i+1;
            if(nums[i]%2==0||nums[i]==0){
                double res=nums[i];
                while(res%2!=0){
                res=res+nums[j];
                j++;
            }li.add(res);
                i++;
        }
            else {
                double res=nums[i];
                while(res%2==0){
                    res=res+nums[j];
                    j++;
                }li.add(res);
                i++;
            }
            }String str = li.stream().map(k->k.toString()).collect(Collectors.joining(", "));
        return str;
    }
}

