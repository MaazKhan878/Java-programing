package midExam;

public class inher {
    int x;
    int y;
    inher(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void d(){
        System.out.println(x +" and "+y);
    }
    
}
class A extends inher{
    int g;
    int k;
    A(int x, int y, int g, int k){
        super(x,y);
        this.g = g;
        this.k = k;
    }
    @Override
    public void d(){
        super.d();
        System.out.println(g+" and "+k);

    }
    
    public void d(int k){
        this.k = k;
    }
    public void d(int k, int g){
        this.g = g;
        this.k = k;
    }
    
}
class MainIn{
    public static void main(String[] args) {
        A a = new A(2, 30, 40, 60);
        a.d();
    }
}
