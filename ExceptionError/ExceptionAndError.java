package ExceptionError;
import java.util.*;

public class ExceptionAndError {
    public static void main(String args[]){
        int a = 1000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Undefine value");
            System.out.println(e);

        }
        int marks[] = new int[3];
        marks[0] = 123;
        marks[1] = 234;
        marks[2] = 134;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Index");
        int index = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();
        try{
            System.out.println("Nested" );
            try{
                System.out.println("The marks as "+marks[index]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The index out of range");
                System.out.println(e);

            }

        }
        catch(Exception e){
            System.out.println("Exception in target");
            System.out.println(e);
        }
        // try{
        //     System.out.println("the value as: "+marks[index]);
        //     System.out.println("Divide value as: "+ marks[index]/number);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Arithmetic Exception: ");
        //     System.out.println(e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Index out of bound");
        //     System.out.println(e);
        // }
        // catch(Exception e){
        //     System.out.println("Some exception ocuured");
        //     System.out.println(e);
        // }
    }
    
}
