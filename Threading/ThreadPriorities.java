package Threading;
class MyPrio extends Thread{
    private String name;
    public void SetName(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; ; i++){
        System.out.println(name);
        }
        
    }
}
public class ThreadPriorities {
    public static void main(String args[]){
        // Ready Queue: T1 T2 T3 T4 T5 .... JVM Maintain Randoml;y run
        // We can give priorities
        // Min priprities -> 1
        // Normal Priorities -> 5
        // Max Priorities -> 10
        // Run all But we give priorities like 10 rupe or 100000rupe
        MyPrio mp1 = new MyPrio();
        mp1.SetName("Maaz Khan");
        MyPrio mp2 = new MyPrio();
        mp2.SetName("Fawad Khan");
        MyPrio mp3 = new MyPrio();
        mp3.SetName("Farukh Khan");
        MyPrio mp4 = new MyPrio();
        mp4.SetName("Sudais Khan");
        MyPrio mp5 = new MyPrio();
        mp5.SetName("Sami Khan");
        mp1.start();
        mp2.start();
        mp3.start();
        mp4.start();
        mp5.start();
        mp5.setPriority(Thread.MAX_PRIORITY);
        mp1.setPriority(Thread.MIN_PRIORITY);
        mp2.setPriority(Thread.MIN_PRIORITY);
        mp3.setPriority(Thread.NORM_PRIORITY);
        mp4.setPriority(Thread.NORM_PRIORITY);
    }
    
}
