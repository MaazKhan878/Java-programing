// package labtask;
// import java.util.Scanner;
// public class Task1 {
//     public static void displayMsg(){
//         System.out.println("Hello");
//         System.out.println("Maaz Khan");
//     }
//     public static void displayName(){
//         String firstName;
//         String secName;
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter first Name: ");
//         firstName = scan.next();
//         System.out.print("Enter second Name: ");
//         secName = scan.next();
//         System.out.println(firstName+" "+secName);

//     }
//     public static void calculator(){
//         System.out.print("Enter the Ist number: ");
//         float a;
//         Scanner scan =new Scanner(System.in);
//         a = scan.nextFloat();
//         System.out.print("Enter the operator: ");
//         char op = scan.next().charAt(0);
//         System.out.print("Enter the 2nd number: ");
//         float b = scan.nextFloat();
//         switch(op){
//             case '+':{
//                 System.out.println("Sum = "+(a + b));
//             }
//             break;
//             case '-':{
//                 System.out.println("Difference= "+(a - b));
//             }
//             break;
//             case '/':{
//                 System.out.println("Division = "+(a/b));
//             }
//             break;
//             case '*':{
//                 System.out.println("Multiply = "+(a*b));
//             }
//             break;
//             default:System.out.println("Wrong input");
//         }
//         if(a%2 == 0){
//             System.out.println("a even number");
//         }
//         else{
//             System.out.println("a not even number");
//         }
//         if(b%2 == 0){
//             System.out.println("b even number");
//         }
//         else{
//             System.out.println("B not even number");
//         }
//     }
//     public static void main(String args[]){
//         displayMsg();
//         displayName();
//         calculator();
//     }
    
// }
