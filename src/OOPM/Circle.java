package OOPM;

public class Circle {
    private int radius;

    public void setRadius(int r){
        radius=r;
    }
    public void calculateArea(){
        double area;
        area=Math.PI*Math.pow(radius,2);
        System.out.println(area);
    }
    public void calculateCircumference(){
        double perimeter;
        perimeter=2*Math.PI*radius;
        System.out.println(perimeter);
    }
}
