package linkesdList;

public class stackString {
    static class n{
        String data;
        n next;
        n(String data){
            this.data = data;
            next = null;
        }
    }   
    static class st{
        public static n head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(String data){
            n newNode = new n(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static String pop(){
            if(isEmpty()){
                return "Null";
            }
            String top = head.data;
            head = head.next;
            return top;
        }
        public static String peak(){
            if(isEmpty()){
                return "Null";
            }
            return head.data;
        }
        public static void print(){
            while(!isEmpty()){
                System.out.println(head.data);
                pop();
            }
        }
    }
    public static void main(String args[]){
        st ss = new st();
        ss.push("MAAZ");
        ss.push("Fawad");
        ss.push("Zahoor");
        ss.print();
    }
}
