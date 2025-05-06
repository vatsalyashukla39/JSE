package Multithreading;

public class UseMyThread3 {
    public static void main(String[] args) {
        MyThread1 m1=new MyThread1("child1");
        MyThread1 m2=new MyThread1("child2");
        MyThread1 m3=new MyThread1("child3");

        try {
            System.out.println("main going to sleep");
            m1.getTh().join();
            System.out.println("m1 dead");
            m2.getTh().join();
            System.out.println("m2 dead");
            m3.getTh().join();
            System.out.println("m3 dead");
            System.out.println("main woke up");

            }

        catch (InterruptedException ex){
            System.out.println("main interrupted");
        }
        System.out.println("main finished");
    }
}
