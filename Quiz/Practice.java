package Quiz;
import java.util.ArrayList;
class maaz<k,v>{
    k x;
    v y;
    maaz(k x, v y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println(x+" "+y);
    }
}
public class Practice {
    public static void main(String args[]){
        maaz<Integer,String> m = new maaz<>(2,"Maaz Khan");
        m.display();

    }
    
}
