package linkesdList;
import java.util.*;
// Know paractice the linkList 
public class linkedP { 
    nd head;
    class nd{
        int vol;
        nd next;
        nd(){}
        nd(int vol){
            this.vol = vol;
        } 
        nd(int vol, nd next){
            this.vol = vol;
            this.next = next;
       }
    }
    
    public nd reverseDelete(int n){
        if(head.next == null){
            return null;
        }
        // size
        int size = 0;
        nd currP = head;
        while(currP != null){
            currP = currP.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int  indxToSearch = size - n;
        nd previous = head;
        int i = 1;
        while(i<indxToSearch){
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return head;
    }
    public void add(int n){
        nd newnd = new nd(n);
        if(head == null){
            head = newnd;
            return;
        }
        nd curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newnd;
        
    }
    public void print(){
        nd newnd = head;
        if(head == null){
           System.out.println("null");
           return;
        }
        while(newnd != null){
            System.out.print(newnd.vol+" ");
            newnd = newnd.next;
        }
    }
    public static void main(String args[]){
        linkedP l = new linkedP();
    
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.print();
        System.out.println();
        l.head = l.reverseDelete(5);
        l.print();
    }
}









