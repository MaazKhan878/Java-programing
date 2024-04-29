package linkesdList;
import java.util.*;
public class bigOfOmethod {
    public static void main(String args[]){
        LinkedList<String> l = new LinkedList<>();
        l.addFirst("Maaz");
        l.addLast("Khan");
        l.addLast("From");
        l.addLast("Dogai");
        // for(int i = 0; i<l.size(); i++){
        //     System.out.print(l.get(i)+" ");
        // }
        LinkedList<String> l2 = new LinkedList<>();
        for(int i = 0; i<l.size(); i++){
            l2.add(l.get(i));
        }
        for(int i = 0; i<l2.size(); i++){
            System.out.print(l2.get(i)+" ");
        }
    }
        
}
