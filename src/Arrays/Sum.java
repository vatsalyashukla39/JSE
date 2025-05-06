package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {

        int s=0;
        if (args.length<2)
            System.out.println("enter at least 2 :");
        for (int i = 0; i < args.length; i++) {
            s+=Integer.parseInt(args[i]);
        }
        System.out.println(s);
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,4);

    }
}
