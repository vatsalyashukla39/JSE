package Loops;

public class Pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j==1)
                    System.out.print("A ");
                if (j==2)
                    System.out.print("B ");
                if (j==3)
                    System.out.print("C ");
                if (j==4)
                    System.out.print("D ");
            }
            System.out.println();
        }
    }
}
