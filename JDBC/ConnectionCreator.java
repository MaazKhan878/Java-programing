package JDBC;
import java.sql.*;
public class ConnectionCreator {
    private static Connection cen;
    public static Connection getConnect(){
        try {
            if(cen == null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/youtube";
                String user = "root";
                String pswd = "maaz0101";
                cen = DriverManager.getConnection(url,user,pswd);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return cen;
    }
    
}
