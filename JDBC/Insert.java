package JDBC;
// dynamic query = paramitized query
// use prepare statement
// data go to java
import java.sql.*;
import java.util.Scanner;
public class Insert {
    public static void main(String[] args) {
        try {
            // creat conection
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String name = "root";
            String pswd = "maaz0101";
            Connection con = DriverManager.getConnection(url,name,pswd);
            // insert data to Create table: query
            // Making dynamic query
            String q = "insert into student(sName,City) values(?,?)";
            // get the preparedStatement object: Work dynamic
            PreparedStatement pt = con.prepareStatement(q);
            // Set the values 
            Scanner scan = new Scanner(System.in);
            for(int i = 0; i<10; i++){
                System.out.print("Enter name: ");
                pt.setString(1,scan.nextLine());
                System.out.println("Enter City Name: ");
                pt.setString(2,scan.nextLine());
                pt.executeUpdate();
            }
            System.out.println("Inserted");
            con.close();
        } catch (Exception e) {
            e.getStackTrace();
            
        }
    }
    
}
