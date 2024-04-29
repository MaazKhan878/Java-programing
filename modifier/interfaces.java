package modifier;
// Interfaces like a classes but pure extraction
// interfaces have no constructor
// No non abstract function well present
// use interface property use implemnts key word on the place of extends
// by default static final and fixed
interface Animale1{
    void Walk();
}
interface Corniverous{
    void eat();
}
class Horse1 implements Animale1, Corniverous{
    public void walk(){
        System.out.println("Walk on 6 legs");
    }
    public void eat(){
        System.out.println("Meat");
    }
}


public class interfaces {
    public static void main(String args[]){
        Horse1 horse = new Horse1();
        horse.walk();
        horse.eat();
    }
    
}
