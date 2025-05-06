package MultithreadingProducerConsumer;

public class SharedObj {
    private int n;
    private boolean isConsumed=true;
    synchronized public void set(int i){
        if(!isConsumed){
            try {
                System.out.println("prod is waiting with "+i);
                wait();
            }catch (InterruptedException ex){

            }
        }n=i;
        isConsumed=false;
        notify();
    }
//    synchronized public int get(){
//        if (isConsumed){
//            try {
//                System.out.println("consumer is waiting "+n);
//                wait();
//            }catch (InterruptedException ex){
//
//            }
//        }

}

