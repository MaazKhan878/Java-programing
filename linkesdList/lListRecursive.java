package linkesdList;

public class lListRecursive {
    node head;
    private int size;
    class node {
        int number;
        node next;
        node(int number){
            this.number = number;
            this.next = null;

        }    
    }
    
    public void addFirst(int number){
        node newNode = new node(number);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;    
    }
    public void print(){
        node newNode = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(newNode != null){
            System.out.print(newNode.number+" ");
            newNode = newNode.next;
        }
    }
    public void reverse(){
        if(head == null || head.next == null){
            return;
        }
        node previous = head;
        node current = head.next;
        while(current != null){
            node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;

        }
        head.next = null;
        head = previous;
    }
    public node reverseRec(node head){
        if(head == null || head.next == null){
            return head;
        }
        node newNode = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String args[]){
        lListRecursive list = new lListRecursive();
        list.addFirst(1);
        list.addFirst(4);
        list.addFirst(6);
        list.addFirst(13);
        list.addFirst(9);
        list.print();
        System.out.println();
        list.reverse();
        list.print();
        System.out.println();
        list.head = list.reverseRec(list.head);
        list.print();
    }
     
}
