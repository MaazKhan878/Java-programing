package Threading;
// Multiprocessing and MultiUser and MultiThreading is different
// Multithreading and Multiprocessing Both use to achieve Multi task
// Multiprocessing -> one operating system with multiple sponing
// OS -> 1 Chrome, 2 -> game etc Os handie it easily(Multiprocess) -> heavyweight
// Process inside MultiTasking -> is Multithreading(with in a process MultiTasking)
// threading -> light weight
// Used shade Memory
// Without thread -> main() -> fun1 -> func2 -> end(func 1 Block func2 if Function 1 is not finished then fun2 will not run)
// with Thread -> main() = funct1 = func2 = end(all end on same time, funct1 never block func2)
// Extends Thread 
// Extends RunnableInterface
// Faster excution with power cpu
// Process Heavy weight CPU will out of resource
class myThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("My thread as running\ni am not heapy");
            i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<2){
            i++;
            System.out.println("My thread2 as Good\nI am heapy");
        }
    }
}
public class MultiThreading {
    public static void main(String args[]){
        myThread my = new myThread();
        myThread2 my2 = new myThread2();
        my.start();//internaly call run method
        my2.start();
    }
    
}
// Explor other function of thread 
// Thanks
