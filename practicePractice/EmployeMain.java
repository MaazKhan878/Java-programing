package practicePractice;
import java.util.*;
class Employe{
    public String name;
    private String pswd;
    private float salary;
    public int age;
    public Employe(String name, String pswd, float salary, int age){
        this.name = name;
        this.pswd = pswd;
        this.salary = salary;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(float salary){
        return salary;
    }
    public boolean getAccess(String pswd){
        return this.pswd.equals(pswd);
    }
    public void employesInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}

public class EmployeMain {
    public static void main(String args[]){
        ArrayList<Employe> emList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How much employe information you want to enter:");
        int a = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i<a; i++){
            System.out.print("Enter the Emplye name: ");
            String name = scan.nextLine();
            System.out.print("Enter Password: ");
            String pswd = scan.nextLine();
            System.out.print("Employe age: ");
            int age = scan.nextInt();
            System.out.print("Enter the Salary: ");
            float salary = scan.nextFloat();
            Employe emp = new Employe(name, pswd, salary, age);
            emList.add(emp);
            scan.nextLine();
        }
        System.out.println("Enter the password: ");
        String check = scan.nextLine();
        boolean access = false;
        for(Employe emp:emList){
            if(emp.getAccess(check)){
                emp.employesInfo();
                access = true;
                break;
            }          
        }
        if(!access){
            System.out.println("Access Denied");
        }
    }  
}
