package OOPM;

public class Worker {
    private int hr;
    private double pr;

    public void setData(int h, double p){
        hr=h;
        pr=p;
    }
    public double getSalary(){
        double salary;
        if (hr>=40)
            salary=40*pr+(hr-40)*pr;
        else
            salary=hr*pr;
        return salary;
    }
}
