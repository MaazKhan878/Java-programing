package QueuePractice;

public class queueA {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class qu{
        public static node head = null;
        public static node tail = null;
        public static Boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void add(int data){
            node newnode = new node(data);
            if(tail == null){
                tail = head = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;

        }
        public static int peek(){
            return head.data;
        }
    }
    public static void main(String args[]){
        qu q = new qu();
        q.add(2);
        q.add(5);
        q.add(8);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
