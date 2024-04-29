package practicePractice;
public class Vechile {
    public void drive(){
        System.out.println("This car as ");
    }
    
    class Car extends Vechile{
        public void drive(){
            System.out.println("Repairing");
        }
    }
    public static void main(String args[]){
        Vechile v = new Vechile();
        Vechile.Car c = v.new Car();
        v.drive();
        c.drive();
    }
    
}
