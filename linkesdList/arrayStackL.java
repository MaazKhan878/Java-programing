package linkesdList;
import java.util.*;
public class arrayStackL {
    static class stk{
        static ArrayList<Integer> s = new ArrayList<>();
        public static boolean isEmpty(){
            return s.size() == 0;
        }
        public static void push(int data){
            s.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = s.get(s.size() - 1);
            s.remove(s.size() -1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return s.get(s.size() - 1);
        }
        public static void print(){
            while(!isEmpty()){
                System.out.println(peek());
                pop();

            }
        }
    }
    public static void main(String args[]){
        stk s = new stk();
        s.push(3);
        s.push(2);
        s.push(1);
        s.print();

    }
}
