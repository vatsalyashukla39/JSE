package Multithreading;

public class MyThread1 implements Runnable {

    private Thread th;
    public MyThread1(String str)
    {   th=new Thread(this,str);
        //start();
        th.start();

    }

    public Thread getTh() {
        return th;
    }

    public void run(){
        try {
            for (int i = 2; i <11 ; i+=2) {
                System.out.println(th.getName()+":"+i);
                Thread.sleep(500);

            }
        }
        catch (InterruptedException ex){
            System.out.println(th.getName()+"interrupted");
        }
        System.out.println(th.getName()+"interrupted");
    }
}
