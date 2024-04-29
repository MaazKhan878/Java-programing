// Mullti inheritance class 
// Parent --> child(parent to) --> child

package inheritance;
class Shape1{
    public void area(){
        System.out.println("Display Area");
    }
}
class Traingle1 extends Shape1{
    public void area(double l, double w){
        System.out.println(1/2.0 * l * w);
    }
}
class Square extends Traingle1{
    public void areaSquare(double l, double w){
        System.out.println(2 * l * w);
    }
}
public class multiLineInheritance {
    public static void main(String args[]){
        double l = 12.3;
        double w = 13.4;
        Square sq = new Square();
        sq.area();
        sq.area(l,w);
        sq.areaSquare(l, w);
    }
    
}
