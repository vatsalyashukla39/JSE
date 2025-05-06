package Multithreading;

public class UseMyThread2 {
    public static void main(String[] args) {
        MyThread m1=new MyThread("child");
        Thread th=new Thread(m1);
        th.start();
        try {
            for (int i=1;i<=10;i+=2){
                System.out.println("main thread: "+i);
                Thread.sleep(1000);

            }
        }
        catch (InterruptedException ex){
            System.out.println("main interrupted");
        }
        System.out.println("main finished");
    }
}
