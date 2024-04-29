package Basic;
public class Circle {
    double radius;
    Circle(double redius){
        this.radius = redius;

    }
    public double getRedius(){
        return radius;

    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI *  radius * radius;
    }
    public double circum(){
        return 2 * Math.PI * radius;
    }
}
class Main{
    public static void main(String args[]){
        double radius = 20.5;
        Circle circle = new Circle(radius);
        circle.getRedius();
        System.out.println(circle.getArea());
        System.out.println(circle.circum());
        double r = 8;
        circle.setRadius(r);
        System.out.println(circle.getArea());
        System.out.println(circle.circum());
    }
}
