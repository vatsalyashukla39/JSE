package OOPM;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int r1= in.nextInt();
        Circle s= new Circle();
        s.setRadius(r1);
        s.calculateArea();
        s.calculateCircumference();

    }
}
