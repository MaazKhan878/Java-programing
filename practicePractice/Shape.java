package practicePractice;

public class Shape {
    public double getArea(){
        return 0.0;
    }
    public class Rectangle extends Shape{
        double length;
        double width;
        Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }
        public double getArea(){
            return length * width;
        }
    }
    public static void main(String args[]){
        Shape s = new Shape();
        Shape.Rectangle r = s.new Rectangle(3.0, 10.0);
        System.out.println(r.getArea());
    }
    
}
