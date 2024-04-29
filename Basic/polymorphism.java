package Basic;
// compile time polymorphism or function overloading
// the argument should not same if all other things same
// if the argument same then the return type should be different
// if the return type same then the argument type shoud different or 
// number of argument should different
public class polymorphism {
    String name;
    int age;
    public void studentinfo(String name){
        System.out.println("Name: "+name);
    }
    public void studentinfo(int age){
        System.out.println("Age: "+age);
    }
    public void studentinfo(String name, int age){
        System.out.println("Name: "+name+ " age: "+age);
    }
    polymorphism(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class poly{
    public static void main(String args[]){
        polymorphism polyM = new polymorphism("Maaz Khan", 24);
        polyM.studentinfo(polyM.name);
        polyM.studentinfo(polyM.age);
        polyM.studentinfo(polyM.name, polyM.age);
    }
}

