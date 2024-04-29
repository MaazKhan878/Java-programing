package Basic;
// Constructer and its types

class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("I am Non Parameter Constructor");
    }
    // student(){
    //     System.out.println("I am Non_paramete constructor");
    // }
    // Student(String name, int age){
    //     System.out.println("I am Constructor with Parameter.");
    //     this.name = name;
    //     this.age = age;
    // }
    Student (Student s2){
        System.out.println("I am Copy constructor");
        this.name = s2.name;
        this.age = s2.age;

    }
    
}
public class OPPS{
    public static void main(String args[]){
        // pen pen1 = new pen();
        // pen1.color = "Blue";
        // pen1.type = "Gro";
        // pen1.printColor();
    //    Student st = new Student();
    //     st.name = "Maaz Khan";
    //     st.age = "23";
    //     st.printinfo(); 
    // Student std = new Student("Maaz Khan", 23);
    // std.printinfo();
    Student s1 = new Student();
    s1.name = "Maaz";
    s1.age = 12;
    Student s2 = new Student(s1);
    s1.printinfo();
    s2.printinfo();
    }
}