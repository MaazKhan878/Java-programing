package labtask;

import java.util.Scanner;

class Calculator{
    double a;
    double b;
    char op;
    public void calculation(){
        System.out.print("Enter the Ist number: ");
        Scanner scan =new Scanner(System.in);
        a = scan.nextFloat();
        System.out.print("Enter the operator: ");
        op = scan.next().charAt(0);
        System.out.print("Enter the 2nd number: ");
        b = scan.nextFloat();
        switch(op){
            case '+':{
                System.out.println("Sum = "+(a + b));
            }
            break;
            case '-':{
                System.out.println("Difference= "+(a - b));
            }
            break;
            case '/':{
                System.out.println("Division = "+(a/b));
            }
            break;
            case '*':{
                System.out.println("Multiply = "+(a*b));
            }
            break;
            default:System.out.println("Wrong input");
        }
    
    }
}
public class CalculatorMain{
    public static void main(String args[]){
        Calculator c = new Calculator();
        c.calculation();


    }
}
