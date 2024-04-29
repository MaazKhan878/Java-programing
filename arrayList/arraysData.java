package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

class StudentData {
    String name;
    String id;

    StudentData(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

public class arraysData {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<StudentData> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for Admin");
            System.out.println("Enter 2 for View");
            System.out.println("Enter 3 for Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of students: ");
                    int numStudents = scanner.nextInt();
                    scanner.nextLine(); 

                    for (int i = 0; i < numStudents; i++) {
                        System.out.print("Enter the name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the id: ");
                        String id = scanner.nextLine();
                        StudentData student = new StudentData(name, id);
                        list.add(student);
                    }
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No data entered.");
                    } else {
                        System.out.println("Data entered:");
                        for (StudentData student : list) {
                            System.out.println("Name: " + student.name);
                            System.out.println("ID: " + student.id);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
