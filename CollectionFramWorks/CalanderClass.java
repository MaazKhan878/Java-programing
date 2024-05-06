package CollectionFramWorks;

import java.util.Calendar;
import java.util.*;
class CalenderW extends Thread{
   
    public void run(){
        while(true){
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            Calendar c = Calendar.getInstance();
            System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class CalanderClass {
    public static void main(String[] args) {
        
        Thread t = new CalenderW();
      
        t.start();
        
        }
      
       

}
    

