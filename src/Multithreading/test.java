package Multithreading;

public class test {
    public static void main(String[] args) {
        Thread th;
        th=Thread.currentThread();
        System.out.println("Thread details: "+ th);
        th.setName("vashu");
        System.out.println("after name change thread details:"+th);
        try {
            for (int i = 1; i <6 ; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(th.getName()+"interrupted");
    }
}
