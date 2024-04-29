package modifier;
// Access for all
// Common for all class
// can access directly by class name
// Use when one thing same for all
// if one time change it change for all
// use 4 type 
// before variable/property of class
// before function
// brfor block of code 
// befor nested classes
// one time memory given
class Student3{
    String name;
    static String School;
}

public class static1{
    public static void main(String args[]){
        Student3.School = "ShadengBard School Science and Technalogy Dogai";
        System.out.println(Student3.School);
    }
}
