package practice.bank;
import java.util.Scanner;
class User{
    public String name;
    public int age;
    private String password;
    User(String name, String password, int age){
        this.name = name;
        this.password = password;
        this.age = age;
    }
    public void creatAccount(){
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        password = scanner.nextLine();
        scanner.close();

    }
    public void age(){
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        scan.close();
    }
    public void addAccount(String name, String password, int age){
        this.name = name;
        this.age = age;
        this.password = password;
    }
    
}
class DepositeMoney{
    double money;
    public void addMoney(float money){
        money+=money;
    }

}
class WithdrawMoney{
    double withDraw;
    public void WithdrawMoney(float money){
          withDraw-=money;
    } 
}

public class Bank{
    public static void main(String args[]){
        while(true){
            System.out.println("Enter the Name: ");
            String name;
            Scanner scan = new Scanner(System.in);
            name = scan.nextLine();
            int age;
            String password;
            System.out.println("Enter the Password: ");
            password = scan.nextLine();
            System.out.println("Enter your age: ");
            age = scan.nextInt();
            User use = new User(name, password, age);
            System.out.println("Create new Password:");
            String choice;
            choice = scan.nextLine();
            if(choice == "Y" ||choice ==  "y"){
                use.addAccount(name, password, age);
            }
        }
    }
    
}
