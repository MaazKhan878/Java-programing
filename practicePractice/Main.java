package practicePractice;
class Main{
    public static void main(String args[]){
        Animale a = new Animale();
        Dog d = new Dog();
        a.animalMakeSound();
        d.animalMakeSound();
        Encapsulation en = new Encapsulation();
        en.setName("Maaz Khan");
        en.setRollNumber(14);
        System.out.println("Name: "+en.getName());
        System.out.println("Roll Number: "+en.getRollNumber());
        en.setName("Fawad Khan");
        Person p = new Person("Maaz Khan", 23);
        p.print();
        
    }
}
    

