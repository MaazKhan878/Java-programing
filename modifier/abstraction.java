package modifier;
// importent things visible to user and non important things not visib le to user
// no need to use because it jus a concept
abstract class Animale{
    abstract void walk();
}
class Horse extends Animale{
    public void walk(){
        System.out.println("Walk with 4 legs");
    }
}
class Chiken extends Animale{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class abstraction {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
        Chiken chiken = new Chiken();
        chiken.walk();
    }
    
}
