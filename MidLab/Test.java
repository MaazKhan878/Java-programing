package MidLab;
import java.util.*;
abstract class DataOperation{
    abstract public void display();
    abstract public void setName(String name);
    abstract public void setEmail(String name);
    abstract public void setId(String name);
    abstract public void setAddress(String name);
    abstract public String getName();
    abstract public String getEmail();
    abstract public String getId();
    abstract public String getAddress();
    
}
class Person extends DataOperation{
    private String name;
    private String address;
    private String id;
    private String email;
  
    Person(){

    }
    Person(String name, String address, String id, String email){
        this.name = name;
        this.address = address;
        this.id = id;
        this.email = email;
       
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setId(String id){
        this.id = id;
    }
   
    @Override
    public String getName() {
        
        return name;
    }
    
    @Override
    public String getAddress() {
        
        return address;
    }
    @Override
    public String getEmail() {
        
        return email;
    }
    @Override
    public String getId() {
        
        return id;
    }
    
    @Override
    public void display() {
        System.out.println("Name: "+name+"\nAddress: "+"\nEmail: "+"\nId: "+id);
        
    }
}
class Student extends Person{
    static String[] subject = new String[6];
    private double[] marks = new double[6];
    public Student(){
        
    }
    public Student(String name, String address, String email,String id, double[] marks){
        super(name, address, id, email);
        this.marks = marks;
    }
    public void setMarks(double[] marks){
        this.marks = marks;
    }
    public double[] getMarks(){
        return marks;
    }
    @Override
    public void display() {
        super.display();
        for(int i = 0; i<marks.length && i< subject.length; i++){
            System.out.println(subject[i]+": "+marks[i]);
        }
    }
}
class Teacher extends Person{
    private String lecturerOf;
    private double salary;
    private Student[] s;
    Teacher(){

    }
    public Teacher(String name, String address, String email,String id, String lec, double salary){
        super(name, address, id, email);
        this.lecturerOf = lec;
        this.salary = salary;
    }
    public void setLecturerOf(String lecturerOf) {
        this.lecturerOf = lecturerOf;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getLecturerOf() {
        return lecturerOf;
    }
    public double getSalary() {
        return salary;
    }
    public void display(){
        super.display();
        System.out.println("Lecture of: "+lecturerOf+"\nSalary: "+salary);
    }
    public void setStudent(Student[] s) {
        this.s = s;
    }
    public Student[] getStudent() {
        return s;
    }
    Scanner scan = new Scanner(System.in);
    public void enterMarks(){
        while(true){
            System.out.println("Enter Student Id: ");
            String id = scan.nextLine();
            for(int i = 0; i<s.length;i++){
                if(id == s[i].getId()){
                    System.out.println("Enter subject name: ");
                    String sub = scan.nextLine();
                    double m[] = new double[6];
                    for(int su = 0; su<Student.subject.length;su++){
                        if(sub == Student.subject[i]){
                            System.out.println("ENTER MARKS: ");
                            m[i] = scan.nextDouble();
                            s[i].setMarks(m);
                        }
                        
                    

                    }
                    
                }
                
            }
            System.out.println("Exite program click y");
            char y = scan.next().charAt(0);
            if(y == 'y'){
                break;
            }
        }
    }
}
class Admin extends Person{
    private Student s[];
    private Teacher t[];
    public int sizeT;
    public int sizeS;
    Admin(){

    }
    public Admin(String name, String address, String email,String id, String lec){
        super(name, address, id, email);
    }
    Scanner scan = new Scanner(System.in);
    public void  setTData(){
        System.out.println("Enter number of teacher: ");
        sizeT = scan.nextInt();
        t = new Teacher[sizeT];
        for(int i = 0; i<sizeT; i++){
        System.out.println("Enter teacher name: ");
            t[i].setName(scan.nextLine());
            System.out.println("Enter teacher id: ");
            t[i].setId(scan.nextLine());
            System.out.println("Enter teacher Email: ");
            t[i].setEmail(scan.nextLine());
            System.out.println("Enter teacher Address: ");
            t[i].setAddress(scan.nextLine());
            t[i].setStudent(s);
        }
        
    }
    public Teacher[] getTData(){
        return t;
    }
    
    public void setSData(){
        System.out.println("Enter number of Student: ");
        sizeS = scan.nextInt();
        s = new Student[sizeS];
        for(int i = 0; i<sizeS; i++){
            System.out.println("Enter Student Name: ");
            s[i].setName(scan.nextLine());
            System.out.println("Enter Student id: ");
            s[i].setId(scan.nextLine());
            System.out.println("Enter Student Email: ");
            s[i].setEmail(scan.nextLine());
            System.out.println("Enter Student Address: ");
            s[i].setAddress(scan.nextLine());
        }      
    }
    
    public Student[] getSData(){
        return s;
    }
    public void subName(){
        System.out.println("Enter subject name: ");
        for(int i = 0; i<6; i++){
            System.out.print(i+" :");
            Student.subject[i] = scan.nextLine(); 

        }
    }


}
public class Test {
    
}
