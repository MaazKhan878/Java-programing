package practicePractice;

public class Encapsulation {
    private String name;
    private int rollN;
    public void setName(String namePass){
        this.name = namePass;
    }
    public String getName(){
        return name;
    }
    public void setRollNumber(int rLn){
        this.rollN = rLn;
    }
    public int getRollNumber(){
        return rollN;
    }

    
}
class Person{
    public String name;
    public int age;
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}

