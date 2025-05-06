package Multithreading;

public class MyThread2 implements Runnable {
    private Thread th;
    public MyThread2(String str,int priority)
    {   th=new Thread(this,str);
        //start();
        th.setPriority(priority);
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
