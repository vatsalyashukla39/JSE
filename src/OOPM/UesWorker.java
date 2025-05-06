package OOPM;

import java.util.Scanner;

public class UesWorker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Eneter hours:");
        int h1= in.nextInt();
        System.out.println("enter payrate:");
        double p1= in.nextDouble();
        Worker w= new Worker();

        System.out.println("Salary = "+w.getSalary());
    }
}
