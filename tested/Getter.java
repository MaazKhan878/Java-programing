package tested;
import java.util.*;

import practicePractice.sorting;
class A{
    private int x;
    public void valueekdam(int x){
        this.x = x;
    }
    public int valueAkhlam(){
        return x;
    }
    public A(int b){
        x = b;
    }
}
class Misc{
    int x = 10;
    float y = 20.0f;
    Misc(){
        System.out.println("3B");
    }
    Misc(int x){
        System.out.println(x);
        this(5,5.0f);
    } 
    Misc(int x , float y){
        System.out.println(x +" "+ y);
    }
}
public class Getter {
    public static void main(String args[]){
        // A a = new A(10);
        // System.out.println(a.valueAkhlam());
        // a.valueekdam(5);
        // int b = a.valueAkhlam();
        // System.out.println(b);
        Misc ms = new Misc(10);
        
    }
    
}
