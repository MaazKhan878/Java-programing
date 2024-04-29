package Quiz;
class Simple{
    int x;
    float y;
    // Constructer overloading
    Simple(int x, float y){
        this.x = x;
        this.y = y;
    }
    Simple(int x){
        this.x = x;
    }
    Simple(float y){
        this.y = y;
    }
    Simple(){}
    int simple(int x , float y){
        return x + (int)y;
    }
    float simple(int x, float y, int k){
        return x + y + k;
    }
    void print(){
        System.out.println("X = "+x+" and "+"Y = "+y);
    }

}
public class SimpleProgram {
    public static void main(String args[]){
        Simple s = new Simple(5,5.0f);
        s.print();
        System.out.println(s.simple(5, 10.0f));
    }
    
}
