package linkesdList;

public class stackL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        public static node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            node newNode = new node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peak(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public static void print(){
            while(!isEmpty()){
                System.out.println(peak());
                pop();
                
            }
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(4);
        s.push(9);
        s.push(10);
        s.push(33);
        s.print();
    }
}