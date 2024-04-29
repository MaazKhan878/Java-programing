package practicePractice;

import modifier.encapsulation;

public class Animale {
    public void animalMakeSound(){
        System.out.println("This animale make sound,");
    }
}
class Dog extends Animale{
    public void animalMakeSound(){
        System.out.println("Barking");
    }
}

