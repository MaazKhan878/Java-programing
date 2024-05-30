package BasicProgram;
import java.util.*;
class Array{
    private String name;
    private double marks[];
    private String subject[];
    Array(String name, int size){
        this.name = name;
        marks = new double[size];
        subject = new String[]{"Report Writing","Calculus","OOPs","SE","PPIT","Financial Acounting"};
    }
    public void takeMarks(int i, double marks){
        this.marks[i] = marks;
    }
    public String getSub(int i){
        return subject[i];
    }
    public void show(){
        System.out.println("Name: "+name);
        int i = 0;
        for(double markSub: marks){
            if(i<subject.length){
            System.out.println("Subject : "+subject[i]+" Marks = "+markSub);
            }
            i++;
            
        }
        
    }
}
public class BasicProgram {
    public static void main(String[] args) {
       Array a = new Array("Maaz Khan", 6);
       Scanner scan = new Scanner(System.in);
       for(int i = 0; i<6; i++){
        System.out.println("Enter the marks of "+a.getSub(i));
        a.takeMarks(i,scan.nextDouble());
       }
       a.show();
    }
}
