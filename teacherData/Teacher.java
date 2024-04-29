package teacherData;
import java.util.Scanner;
class teachD{
    String name;
    String id;
    teachD(String name, String id){
        this.name = name;
        this.id = id;
    }
}

public class Teacher {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        teachD[] teach = null;
        while(true){
            System.out.println("Enter 1 for Admin");
            System.out.println("Enter 2 for view");
            System.out.println("Enter 3 for Exite");
            System.out.print("Enter the choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:{
                    System.out.println("Enter number of Teacher");
                    int num = scanner.nextInt();
                    teach = new teachD[num];
                    scanner.nextLine();
                    for(int i = 0; i<num; i++){
                        System.out.print("Enter the name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the id: ");
                        String id = scanner.nextLine();
                        teachD Tch = new teachD(name, id);
                        teach[i] = Tch;

                    }

                }
                break;
                case 2:{
                    for(teachD tcH: teach){
                        System.out.println("Name: "+tcH.name);
                        System.out.println("Id: "+tcH.id);
                    }
                }
                break;
                case 3:{
                    System.out.println("The program as stoped.....");
                    System.exit(0);
                    
                }
            }
        }

    }
}
