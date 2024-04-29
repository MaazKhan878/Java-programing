
package labtask;
import java.util.*;
class Student{
    private String name;
    private String regNo;
    private ArrayList<String> courseRegister;
    private ArrayList<Double>marks;
    private int semester;
    private String gender;
    private String dateOfBirth;
    
    Student(String name, String regNo,int semester,String gender, String dateOfBirth){
        this.name = name;
        this.regNo = regNo;
        this.semester = semester;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.courseRegister = new ArrayList<>();
        this.marks = new ArrayList<>();

    }
    public void regCourse(String course){
        courseRegister.add(course);
    }
    public void dropCourse(String course){
        courseRegister.remove(course);
    }
    public void addMarks(double markPerSubject){
        marks.add(markPerSubject);
    }
    public double addAllMarks(){
        double totalM = 0.0;
        for(double mark: marks){
            totalM+=mark;

        }
        return totalM;
    }
    public void studentInfo(){
        System.out.println("Name: "+name+"\nRegistration number: "+"\nSemester: "+semester+"\nGender: "+gender+"\nDate of Birth: "+dateOfBirth);
        for(String course:courseRegister){
            System.out.println("Register course:"+course);
        }
        for(double mark:marks){
            System.out.println("Marks per subject: "+mark);
        }
        System.out.println("Total Marks: "+addAllMarks());
    }

}

public class StudentMain {
    public static void main(String argsd[]){
        Student st = new Student("Maaz Khan","SP23-BSE-109",3,"Male","1-1-2004");
        st.regCourse("OOPS");
        st.regCourse("English");
        st.dropCourse("English");
        st.regCourse("DSA");
        st.addMarks(72.0);
        st.addMarks(80.0);
        st.studentInfo();
    }
    
}
