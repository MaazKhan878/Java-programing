package inheritance;
// Single line inheritance
// Base class --> one derived class or parent --> child
class Shape{

    public void area(){
        System.out.println("Display area");
    }
}
class Traingle extends Shape{
    double l;
    double w;
    Traingle(double l, double w){
        this.l = l;
        this.w = w;

    }

    public void area(double l, double w){
        System.out.println((1/2.0) * l * w);
    }

}

public class singleLevelInheritance {
    public static void main(String args[]){
        double l = 23.5;
        double w = 24.3;
        Traingle tr = new Traingle(l,w);
        tr.area();
        tr.area(l, w);
    }
    
}
