package labtask;
import java.util.Scanner;
public class EvenOrOdd {
    public static boolean even(int number){
        if(number%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        if(even(number)){
            System.out.printf("the number %d as Even",number);
        }
        else{
            System.out.printf("The number %d as odd",number);
        }
    }
    
}
