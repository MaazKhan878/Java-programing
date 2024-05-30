package Saad;
import java.util.*;
public class IstProgram {
    int x;
    int y;
    String name;
    IstProgram(int x, int y){
        this.x = x;
        this.y = y;
    }
   IstProgram(){
    x = 0;
    y = 0;
    name = null;
   }
   IstProgram(String n, int num){
    name = n;
    x = num;
   }
    
}
class Test{
    public static void main(String[] args) {
        // IstProgram p = new IstProgram();
        // IstProgram p1 = new IstProgram(3,4);
        // System.out.println(p1.x);
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the Name: ");
        // String name = scan.nextLine();
        // System.out.println("Enter the value: ");
        // int num = scan.nextInt();
        // IstProgram p2 = new IstProgram(name, num);
        // System.out.println(p2.name + "  " + p2.x);
        IstProgram p3 = new IstProgram();
        System.out.println("Ist value: ");
        p3.x = scan.nextInt();
        System.out.println("2nd value: ");
        p3.y = scan.nextInt(); 
        scan.nextLine();
        System.out.println("Name : ");
        p3.name = scan.nextLine();
        System.out.println(p3.x +" "+p3.y+" "+p3.name);
        
    }
}
