package MaazSwaty;
class Person {
    private String name;
    private String address;
    private String phone_no;
    private String email;

    public Person(String name, String address, String phone_no, String email) {

        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
        this.email = email;
    }

    public void display() {
        System.out.printf(" %s, %s, %s, %s%n", name, address, phone_no, email);

    }

}

class Student extends Person {
    private String status;

    public Student(String name, String address, String phone_no, String email, String status) {
        super(name, address, phone_no, email);
        this.status = status;
    }

    public void display() {
        super.display();
        System.out.printf(" %s%n", status);

    }
}

class Employee extends Person {
    private int office_no;
    private double salary;
    private String dateHired;

    public Employee(String name, String address, String phone_no, String email, int office_no, double salary,
            String dateHired) {
        super(name, address, phone_no, email);
        this.office_no = office_no;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public void display() {
        super.display();
        System.out.printf("%d, %.2f, %s%n", office_no, salary, dateHired);

    }
}

class Faculty extends Employee {
    private String office_work;
    private String rank;

    public Faculty(String name, String address, String phone_no, String email, int office_no, double salary,
            String dateHired, String office_work, String rank) {
        super(name, address, phone_no, email, office_no, salary, dateHired);
        this.office_work = office_work;
        this.rank = rank;
    }

    public void display() {
        super.display();
        System.out.printf("%s, %s%n", office_work, rank);

    }

}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone_no, String email, int office_no, double salary,
            String dateHired, String title) {
        super(name, address, phone_no, email, office_no, salary, dateHired);
        this.title = title;
    }

    public void display() {
        super.display();
        System.out.printf("%s%n", title);

    }

}

public class Problem1 {
    public static void main(String[] args) {

        Student s1 = new Student("Maaz Khan", "Swat", "0347-9706949",
                "maazswat942@gmail.com", "Active");
        System.out.println("Student : ");
        s1.display();

        Faculty f1 = new Faculty("Fawad Khan", "Dogai", "0347-9706940",
                "maazswat942@gmail.com", 321, 500000.00,
                "20/05/2020", " 6-hours", "middle level");
        System.out.println("\n Faculty : ");
        f1.display();

        Staff sf1 = new Staff("Sudais Khan", "Swat", "0347-9706949",
                "maazswat942@gmail.com", 321, 500000.00,
                "20/05/2020", " CS departement");
        System.out.println("\n Staff : ");
        sf1.display();
    }

}