package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
public class JDBCConnection {
    public static void main(String[] args) {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String pswd = "maaz0101";
            Connection con = DriverManager.getConnection(url,username,pswd);
            if(con.isClosed()){
                System.out.println("Connection is not made");
            }
            else{
                System.out.println("Connection is maded.......");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
