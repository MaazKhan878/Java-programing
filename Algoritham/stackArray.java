package Algoritham;
import java.util.*;
public class stackArray {
    static class stack{
        static ArrayList<Integer> l = new ArrayList<>();
        public static boolean isEmpty(){
            return l.size() == 0;
        }
        public static void push(int data){
            l.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = l.get(l.size() - 1);
            l.remove(l.size() - 1);
            return top;
        }
        public static int peak(){
            if(isEmpty()){
                return -1;
            }
            return l.get(l.size() - 1);
        }
    }
    public static void main(String args[]){
        stack s = new stack();
        s.push(3);
        s.push(5);
        s.push(6);
        while(!s.isEmpty()){
            System.out.println(s.peak());
            s.pop();

        }
    }
}
