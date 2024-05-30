package JDBC;
import java.sql.*;
public class CreateTable {
    public static void main(String[] args) {
        try {
            // create connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String uName = "root";
            String pswd = "maaz0101";
            Connection con = DriverManager.getConnection(url,uName,pswd);
            // Create query 
            String q = "create table table1(tid int not null unique  auto_increment primary key, tName varchar(50) not null, tCity varchar(50) not null)";
            
            // create a statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table is created in dataBase...");
            con.close();
        } catch (Exception e) {
                e.getStackTrace();
            
        }
    }
    
}
