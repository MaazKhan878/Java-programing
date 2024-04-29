package Basic;
import java.util.Scanner;
class Student1{
    String name;
    int age;
    String regNo;
    float marks;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.regNo);
        System.out.println(this.marks);
    }
    Student1(String name, int age, String regNo, float marks){
        this.name = name;
        this.regNo = regNo;
        this.age = age;
        this.marks = marks;
    }
}
public class constructor {
    public static void main(String args[]){
        String name, regNo;
        int age;
        float marks;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        name = scan.nextLine();
        System.out.print("Enter the Reg Number: ");
        regNo = scan.nextLine();
        System.out.print("Enter the Age of Student: ");
        age = scan.nextInt();
        System.out.print("Enter the marks of student: ");
        marks = scan.nextFloat();
        scan.close();
        Student1 std = new Student1(name, age, regNo, marks);
        std.printinfo();
    }
    
}
