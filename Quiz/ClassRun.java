package Quiz;

import org.junit.platform.engine.discovery.ClassSelector;

class Classwork{
    int n;
    Classwork(){
        System.out.println("Section 3B");
    }
    Classwork(int n){
        this();
        this.n = n;
        System.out.println(n);

    }
}
class ClassNested{
    int k;
    ClassNested(int k){
        this.k = k;
    }
    void print(){
        System.out.println("Enclose class with value = "+k);
    }
    public class B{
        int d;
        B(int d){
            this.d = d;
        }
        void print(){
            System.out.println("Nested class with value = "+d);
        }
    }
}
public class ClassRun {
    public static void main(String args[]){
        Classwork c = new Classwork(5);
        ClassNested cn = new ClassNested(3);
        ClassNested.B cl = cn.new B(2);
        cn.print();
        cl.print();
    }
}
