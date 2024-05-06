package inheritance;
class A {
    public void display(){
        System.out.println("I am Class A");
    }
}
class B extends A{
    public void display(){
        System.out.println("I am Class B");
    }
}

public class Test {
    public static void main(String args[]){
        B b = new B();
        b.display();
        ((A)b).display();
    }
    
}
