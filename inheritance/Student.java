package inheritance;
class person{
    String name;
    int age;
    String gender;
}
public class Student extends person{
    public void Studentinfo(){
        System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender);
    }
    Student(String name, String gender, int age){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

}
class MainInher{
    public static void main(String args[]){

        Student st = new Student("Maaz Khan", "Male", 24);
        st.Studentinfo();

    }
    
}
