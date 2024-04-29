package tested;
import java.util.*;
class Student{
    public String name;
    public String id;
    private String password;
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;

    }
    Student(String name, String id){
        this.name = name;
        this.id = id;
    }
}
public class StudentData {
    public static void main(String args[]){
        Student[] students = null;
        while(true){
            System.out.print("Enter 1 For Entering data\nEnter 2 for Seening Data\nEnter 3 for exite\nEnter choice:  ");
            int choice;
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:{
                    System.out.println("Enter the number of student");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    students = new Student[n];
                    for(int i = 0; i<n; i++){
                        System.out.println("Student number "+(i + 1)+" Data entered");
                        System.out.print("Enter the name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the id: ");
                        String id = scanner.nextLine();
                        Student student = new Student(name, id);
                        System.out.print("Enter password: ");
                        String pass = scanner.nextLine();
                        student.setPassword(pass);
                        students[i] = student;    
                    }

                }
                break;
                case 2:{
                    for(Student student:students){
                        System.out.println("Name: "+student.name);
                        System.out.println("Id: "+student.id);
                        System.out.println("Password: "+student.getPassword());
                    }

                }
                break;
                case 3:{
                    System.out.println("Exit program...");
                    scanner.close();
                    System.exit(0);
                }
                break;
                default: System.out.println("You enter wrong option");
            }
            
        }
    }
    
}

