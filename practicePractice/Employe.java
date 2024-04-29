// package practicePractice;
// import java.time.Period;
// import java.time.LocalDate;
// import java.util.ArrayList;
// public class Employe {
//     private String name;
//     private double salary;
//     private LocalDate date;
//     Employe(String name, double salary, LocalDate date){
//         this.name = name;
//         this.salary = salary;
//         this.date = date;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public void setSalary(double salary){
//         this.salary = salary;
//     }
//     public void setDate(LocalDate date){
//         this.date = date;
//     }
//     public String getName(){
//         return this.name;
//     }
//     public double getSalary(){
//         return salary;
//     }
//     public LocalDate getDate(){
//         return date;
//     }
//     public int getYearOfServiece(){
//         return Period.between(date, LocalDate.now()).getYears();
//     }
//     public void printDetail(){
//         System.out.println("Name: "+name);
//         System.out.println("Salary: "+salary);
//         System.out.println("Year of service: "+getYearOfServiece());
//     }

    
// }
// class M{
//     public static void main(String args[]){
//         Employe em = new Employe("Maaz Khan", 30000.0, LocalDate.parse("2015-01-09"));
//         em.printDetail();
       
//     }
// }
