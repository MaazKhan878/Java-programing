package JDBC;
// First program of JDBC 
import java.sql.*;
public class firstJDBC {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Creating connection 
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "maaz0101";
            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("Connection is stell closed");
            }
            else{
                System.out.println("Connection is created");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
