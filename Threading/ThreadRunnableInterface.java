package Threading;
class MyThreadRunnable implements Runnable{
    public void run(){
        for(int i = 0; i<12; i++){
        System.out.println("I am a Thread not a Threat");
        }
        
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for(int i = 0; i<11; i++){
            System.out.println("I am a thread2 i think i kill the first thread haha");
        }
    }
}
public class ThreadRunnableInterface {
    public static void main(String args[]){
        // Thread never wait for function it directly run another
        // we cannot run runnable interface directly through start() method
        MyThreadRunnable mr = new MyThreadRunnable();
        Thread mrT = new Thread(mr);
        MyThreadRunnable2 mr2 = new MyThreadRunnable2();
        Thread mrT2 = new Thread(mr2);
        mrT.start();
        mrT2.start();
       
    }
    
}
// Explor other Functions
