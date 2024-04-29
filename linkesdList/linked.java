package linkesdList;
import java.util.*;
public class linked {
    N head;
    linked(){
        this.size = 0;
    }
    private int size;
    class N {
        String data;
        N next;
        N(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addF(String data){
        N newNode = new N(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }
    public void addL(String data){
        N newNode = new N(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        N currNode = head;
        while(currNode.next!= null){
            currNode = currNode.next;;
        }
        currNode.next = newNode;
        
    }
    public void dltF(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        head = head.next;
        size--;
        
    }
    public void dltL(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        N sn = head;
        N lnode = head.next;
        while(lnode.next != null){
            lnode = lnode.next;
            sn = sn.next;
        }
        sn.next = null;
    }
    public void print(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        N newNode = head;
        while(newNode!= null){
            System.out.print(newNode.data + " -> ");
            newNode = newNode.next;
        }
        System.out.println("Null");
    }
    public int getSize(){
        return this.size;
    }
    public static void main(String args[]){
        linked l = new linked();
        l.addF("Khan");
        l.print();
        l.addL("Maaz");
        l.print();
        l.dltF();
        l.print();
        l.addF("King");
        l.print();
        l.addL("Khan");
        l.print();
        l.dltL();
        l.print();
        System.out.println(l.getSize());
        l.dltF();
        System.out.println(l.getSize());
        l.dltF();
        System.out.println(l.getSize());
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Khan");
        list.addFirst("Maaz");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.addLast("King");
        System.out.println(list);
    }
    
}
