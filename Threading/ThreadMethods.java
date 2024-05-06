package Threading;
class Methods extends Thread{
    Methods(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i<11; i++){
         
           System.out.println("I am a Programmer "+this.getName());
           try{
             Thread.sleep(1000);
           }
           catch(Exception e){
             System.out.println(e);
           }

        }
    }
}
public class ThreadMethods {
    public static void main(String args[]){
        Methods m1 = new Methods("Maaz Khan");
        //Methods m2 = new Methods("Fawad Khan");
        myThread m4 = new myThread();
        m1.start();
        // try{
        //     m1.join();// Use to run the m1 First all then m2 objeect
        // }
        // catch (Exception e){
        //     System.out.println(e);
        // }
        
        //m2.start();
        m4.start();

    }
    
}
// Try Method from internet 
// You Learn in Operating system course
d