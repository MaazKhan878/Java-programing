package labtask;
// Q1 
// Answer
class Book{
    private String bookId;
    private int pages;
    private double price;
    Book(String bookId, int pages, double price){
        this.bookId = bookId;
        this.pages = pages;
        this.price = price;
    }
    public void setBookId(String bookId){
        this.bookId = bookId;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void show(){
        System.out.println("Book Id: "+bookId+"\nNumber of pages: "+pages+"\nPrice: "+price);
    }
}
// Q2
class Building{
    public int floors;
    public double area;
    public int occupants;
    Building(int floor, double area, int occupants){
        this.floors = floors;
        this.area = area;
        this.occupants = occupants;
    }
    public double areaPerPerson(){
        return area/occupants;
    }
}
// Q3
class Fibonacci{
    public int previous = 0;
    public int current = 1;
    public int sum;
    public void generatFib(int n){
        for(int i = 0; i<n; i++){
            sum = previous + current;
            System.out.print(current+" ");
            previous = current;
            current = sum;
            
        }

    }
}
// Q4
class Circle{
    public double radius;
    Circle(){
        this.radius = 0.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    public double calculatCircumference(){
        return 2 * Math.PI * radius;
    }

}
// Q5 
class Account{
    private double balance;
    Account(double balance){
      this.balance = balance;
    }
    Account(){
        this.balance = 0;
    }
    public void deposite(double balance){
        this.balance += balance;
    }
    public void withdraw(double balance){
        this.balance -= balance;
    }
    public void ShowBalance(){
        System.out.println("Your account Balance as: "+balance+"$");
    }
    
}
// Q6
class Distencel{
    private double feet;
    private double inch;
    Distencel(){
        this.feet = 0.0;
        this.inch = 0.0;
    }
    Distencel(double inch, double feet){
        this.feet = feet;
        this.inch = inch;
    }
    public void setFeet(double feet){
        this.feet = feet;
    }
    public void setInch(double inch){
        this.inch = inch;
    }
    public void showInfo(){
        System.out.println("Feet: "+feet+"\nInch: "+inch);
    }
}
// Q7
class Marks{
    private double marks1;
    private double marks2;
    private double marks3;
    Marks(){
        this.marks1 = 0.0;
        this.marks2 = 0.0;
        this.marks3 = 0.0;
    }
    Marks(double marks1, double marks2, double marks3){
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public double CaculateMarks(){
        return marks1 + marks2 + marks3;
    }
}
// Q8
class Time{
    int second;
    int minute;
    int houre;
    Time(int houre, int min, int sec){
        this.second = sec;
        this.minute = min;
        this.houre = houre;
    }
    Time(){
        this.second = 0;
        this.minute = 0;
        this.houre =  0;
    }
    public void addTime(int houre, int min, int sec){
        this.second += sec;
        this.minute += min;
        this.houre += houre;
        if(this.second>=60){
            this.second -= 60;
            this.minute++;
        }
        if(this.minute >= 60){
            this.minute -= 60;
            this.houre++;
        }
        if(this.houre >=24){
            this.houre -= 24;
        }
    }
    public void display(){
        System.out.println(houre+":"+minute+":"+second);
    }
}
// Q9
class Marks1{
    private double marks1;
    private double marks2;
    private double marks3;
    Marks1(double marks1, double marks2, double marks3){
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public void setMarks1(double marks){
        this.marks1 = marks;
    }
    public void setMarks2(double marks){
        this.marks2 = marks;
    }
    public void setMarks3(double marks){
        this.marks3 = marks;
    }
    public double getMarks1(){
        return this.marks1;
    }
    public double getMarks2(){
        return this.marks2;
    }
    public double getMarks3(){
        return this.marks3;
    }
    public void display(){
        System.out.println("Marks1: "+marks1+"\nMarks2: "+marks2+"\nMarks3: "+marks3);
    }
}
// Q10
class Account2{
    private double balance;
    Account2(){
        this.balance = 0.0;
    }
    Account2(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposite(double balance){
        if(balance > 0){
            this.balance += balance;
        }
        else{
            System.out.println("Invalide deposition");
        }
    }
    public void withdraw(double balance){
        if(balance > 0 && balance <= this.balance){
            this.balance -= balance;
        }
        else{
            System.out.println("Insuficient amount...");
        }
    }
    public void display(){
        System.out.println("Balance: "+balance);
    }
}
//Q11
class HotDogStand {
    private int standID;
    private int hotDogsSold;
    public HotDogStand(int standID, int hotDogsSold) {
        this.standID = standID;
        this.hotDogsSold = hotDogsSold;
    }
    public void justSold() {
        hotDogsSold++;
    }
    public int getHotDogsSold() {
        return hotDogsSold;
    }
}

public class Task2 {
    public static void main(String args[]){
        // Answer 1 Runner
        Book bk = new Book("mk48", 500, 1500.0);
        bk.show();
        bk.setBookId("ghost1k6");
        bk.setPages(3000);
        bk.setPrice(50000);
        bk.show();
        // Answer 2 Runner
        Building house = new Building(2,500.0 , 3);
        System.out.println("House area per person: "+house.areaPerPerson());
        Building office = new Building(6,1900.0 , 8);
        System.out.println("House area per person: "+office.areaPerPerson());
        // Answer 3 Runner
        Fibonacci fb = new Fibonacci();
        fb.generatFib(6);
        System.out.println();
        // Answer 4 runner
        Circle circle = new Circle(34.5);
        System.out.println(circle.calculatCircumference());
        Circle circle2 = new Circle();
        circle2.radius = 4;
        System.out.println(circle2.calculatCircumference());
        // Answer 5 runner
        Account account = new Account();
        account.deposite(100.0);
        account.withdraw(50.0);
        account.ShowBalance();
        Account account1 = new Account(1000000.0);
        account1.withdraw(80000);
        account1.ShowBalance();
        // Answer 6 runner
        Distencel distence = new Distencel(12.0,120.0);
        distence.showInfo();
        // Answer 7 runner
        Marks mrk = new Marks(80,85.5 , 95.55);
        System.out.println("Total marks: "+mrk.CaculateMarks());
        // Answer 8 runner
        Time t = new Time(12,30,60);
        t.display();
        // Answer 9 runner
        Marks1 mrk1 = new Marks1(34.0, 100.0, 12);
        mrk1.display();
        mrk1.setMarks1(12);
        mrk1.display();
        System.out.println(mrk1.getMarks1());
        Account2 act1 = new Account2(12000);
        Account2 act2 = new Account2(act1.getBalance());
        act2.display();
        // Answer 11
        HotDogStand stand1 = new HotDogStand(1, 10);
        HotDogStand stand2 = new HotDogStand(2, 15);
        HotDogStand stand3 = new HotDogStand(3, 20);
        stand1.justSold();
        stand2.justSold();
        stand2.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();
        System.out.println("Hot Dogs Sold at Stand 1: " + stand1.getHotDogsSold());
        System.out.println("Hot Dogs Sold at Stand 2: " + stand2.getHotDogsSold());
        System.out.println("Hot Dogs Sold at Stand 3: " + stand3.getHotDogsSold());


    }
    
}
