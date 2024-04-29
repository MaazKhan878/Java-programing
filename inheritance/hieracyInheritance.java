// Hierachy inheritance which base class can inherited to different classes
// parent -->child(1)
// parent -->child(2)
// parent -->child(n)
package inheritance;
class Shape2{
    public void area(){
        System.out.println("Display area");
    }
}
class Rectangle extends Shape2{
    public void area(double l, double w){
        System.out.println(1/2.0 * l * w);
    }
}
class Square2 extends Shape2{
    public void area(double l, double w){
        System.out.println(2.0 * l * w/2.0);
    }
}

public class hieracyInheritance {
    public static void main(String args[]){
        Rectangle rt = new Rectangle();
        rt.area();
        double l = 12.4;
        double w = 20.4;
        rt.area(l, w);
        Square2 sq = new Square2();
        sq.area();
        sq.area(l, w);
    }
    
}
