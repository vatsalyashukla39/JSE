package Multithreading;

public class MyThread extends Thread {
    private String name;
    public MyThread(String str)
    {
        name=str;
        System.out.println("Thread details: "+this);
        //start();
        Thread th=new Thread(this);
        th.start();

    }
    public void run(){
        try {
            for (int i = 2; i <11 ; i+=2) {
                System.out.println(getName()+":"+i);
                Thread.sleep(500);

            }
        }
        catch (InterruptedException ex){
            System.out.println(getName()+"interrupted");
        }
        System.out.println(getName()+"interrupted");
    }
}
