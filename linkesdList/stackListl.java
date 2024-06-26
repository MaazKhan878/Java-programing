package linkesdList;
import java.util.*;

import Basic.polymorphism;
public class stackListl {
    public static void pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data, s);
        s.push(top);

    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        pushBottom(67, s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
