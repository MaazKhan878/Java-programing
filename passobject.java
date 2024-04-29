class B{
    int x;
    int y;
    B(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void print(){
        System.out.println("B Class Value");
        System.out.println((x+y));
    }
}
class A{
    int x;
    int y; 
    B b;
    A(int a, int b, B d){
        x = a;
        y = b;
        this.b = d;

    }
    public A returnob(A a){
        B e = new B(8,15);
        A b = new A(a.x + x,a.y+y,e);
        return b;
    }
    public void print(){
        System.out.println("A Class Value");
        System.out.println((x+y));
        b.print();
    }
}
public class passobject{
    public static void main(String args[]){
        B e = new B(18, 16);
        A a = new A(4,6, e);
        
        A b = a.returnob(a);
        b.print();
    

    }
}