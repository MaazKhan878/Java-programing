package Algoritham;
import java.util.*;
public class QueueFromCollection {
    public static void main(String args[]){
        // Queue q = new LinkedList<>();
        Queue q = new ArrayDeque<>();
        q.add(2);
        q.add(3);
        q.add(45);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
