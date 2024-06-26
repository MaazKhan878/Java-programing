package Algoritham;

public class queuethroughLinkList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head == null & tail == null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;      
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
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return head.data;
        }
       
    }
    public static void main(String args[]){
        queue q = new queue();
        q.add(4);
        q.add(3);
        q.add(44);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

