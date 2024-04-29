package linkesdList;

public class Ll {
    Nod head;
    private int size;
    class Nod{
        String data;
        Nod next;
        Nod(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addF(String data){
        Nod newNode = new Nod(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }  
    public void addL(String data){
        Nod node = new Nod(data);
        if(head == null){
            head = node;
            return;
        }
        Nod currNode = head;
        while(currNode.next!= null){
            currNode= currNode.next;
        }
        currNode.next = node;
    }
    public void DF(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        head = head.next;
    }
    public void DL(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Nod sL = head;
        Nod l = head.next;
        while(l.next!=null){
            l = l.next;
            sL = sL.next;
        }
        sL.next = null;
    }
    public void print(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Nod newNode = head;
        while(newNode!= null){
            System.out.print(newNode.data+ " -> ");
            newNode = newNode.next;
        }
        System.out.println("Null");

    }
    public static void main(String args[]){
        Ll l = new Ll();
        l.addF("maaz");
        l.addF("Khan");  
        l.print();
        l.addL("Good");
        l.print();
        l.DF();
        l.print();
        l.DL();
        l.print();
        l.DL();
        l.print();
        
    }
}
