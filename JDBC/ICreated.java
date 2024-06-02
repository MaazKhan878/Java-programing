package JDBC;
import java.sql.*;
import java.util.*;
public class ICreated {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                String url = "jdbc:mysql://localhost:3306/youtube";
                String uName = "root";
                String pswd = "maaz0101";
                Connection con = DriverManager.getConnection(url,uName,pswd);
                String q = "Create table if not exists Employee (Id int not null primary key auto_increment, Name varchar(50) not null, Salary double not null )";
                Statement stmt = con.createStatement();
                stmt.executeUpdate(q);
                String insertQ = "insert into Employee(Name, Salary) value(?,?)";
                PreparedStatement pt = con.prepareStatement(insertQ);
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter the number of Employee: ");
                int num = scan.nextInt();
                
                for(int i = 0; i<num; i++){
                    scan.nextLine();
                    System.out.print("Enter Employee name: ");
                    pt.setString(1, scan.nextLine());
                    System.out.println("Enter employee Salary: ");
                    pt.setDouble(2, scan.nextDouble());
                    pt.executeUpdate();
                }
                con.close();
                
            } catch (Exception e) {
                
            }       
        }
        catch(Exception e){
            System.out.println("Error in name");

        }
    }
    
}
