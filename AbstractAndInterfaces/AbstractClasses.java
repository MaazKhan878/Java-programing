package AbstractAndInterfaces;
abstract class Student{
   
   abstract String getName();
   abstract void setName(String name);
   public void show(){
    System.out.println("im a student");
   }
   
}
class StudentName extends Student{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }
    public void show(){
        System.out.println(name);
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        Student s = new StudentName();
        s.setName("Maaz Khan");
        System.out.println(s.getName());
    }
    
}
