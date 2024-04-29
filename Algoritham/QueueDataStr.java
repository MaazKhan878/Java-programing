package Algoritham;

public class QueueDataStr {
    public static class queue{
        static int size;
        static int arr[];
        static int rear;
        static int front;
        queue(int data){
            arr = new int[data];
            this.size = data;
            this.front = 0;
            this.rear = -1;
        }
        public static boolean isEmpty(){
            return rear < front;
        }
        
        public static void add(int data){
            if(rear == size - 1){
                System.out.println("Full q");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int fe = arr[front];
            front++;
            return fe;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        queue q = new queue(5);
        q.add(3);
        q.add(5);
        q.add(1);
        q.add(67);
        while(!q.isEmpty()){
            System.out.println(q.peek());  
            q.remove();
        }
    }
    
}
