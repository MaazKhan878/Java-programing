package Threading;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("I am thread");
        }
    }
}
class MyThr2 implements Runnable{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("I am a Maaz Khan and Munipulating thread class");
        }
    }
}
public class ConstructerOfThread {
    public static void main(String args[]){
        MyThr my = new MyThr("Maaz Khan");
        MyThr my2 = new MyThr("Fawad Khan");
        my.start();
        my2.start();
        System.out.println("Thread id: "+my.getId());
        System.out.println("Thread Name: "+my.getName());
        System.out.println("Thread2 id: "+my2.getId());
        System.out.println("Thread2 Name: "+my2.getName());
        MyThr2 my3 = new MyThr2();
        Thread th = new Thread(my3, "Maaz Khan");
        th.start();
        System.out.println("Thread Id: "+th.getId());
        System.out.println("Thread Name:"+th.getName());

    }
    
}
// Most useful method learn 
