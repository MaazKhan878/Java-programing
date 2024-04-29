package Algoritham;
public class circulorQueue {
    public static class Queue{
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;
        Queue(int size){
            this.size = size;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        public static void add(int n){
            if(isFull()){
                System.out.println("Full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = n;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int remover = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }
            
            return remover;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(3);
        q.add(2);
        q.add(1);
        q.add(4);
        q.add(6);
        q.remove();
        q.add(89);
        q.remove();
        q.add(122);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
