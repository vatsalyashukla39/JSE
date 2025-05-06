package Loops;

public class Pattern1 {
    public static void main(String[] args) {
        int a=0,b=4%5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=5 ; j++) {
                a++;
                if (a%2==0)
                    System.out.print("- ");
                else
                    System.out.print("* ");
            }
            System.out.println(b);
        }
    }
}
