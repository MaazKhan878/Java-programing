package Basic;
public class person {
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printinfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
    
}
// class Main{
//     public static void main(String args[]){
//         person pr = new person("Maaz Khan", 24);
//         pr.printinfo();
//     }

// }
