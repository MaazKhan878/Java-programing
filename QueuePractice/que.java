package QueuePractice;

public class que {
    public static class queue{
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;
        queue(int data){
            this.size = data;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Full class");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return - 1;
            }
            int remover = arr[front];
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front + 1) % size;
            }
            return remover;
        }
        public static int front(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
            
        }
    }
    public static void main(String args[]){
        queue q = new queue(5);
        q.add(2);
        q.add(4);
        q.add(7);
        q.add(9);
        while(!q.isEmpty()){
            System.out.print(q.front()+" ");
            q.remove();
        }
    }
    
}
