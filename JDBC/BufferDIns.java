package JDBC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.*;
public class BufferDIns {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String u = "jdbc:mysql://localhost:3306/youtube";
            String name = "root";
            String pd = "maaz0101";
            Connection con = DriverManager.getConnection(u,name,pd);
            
            String q = "insert into table1(tName,tCity) value(?,?)";
            PreparedStatement pt = con.prepareStatement(q);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name:");
            String name1= br.readLine();
            System.out.println("Enter City Name: ");
            String city = br.readLine();
            pt.setString(1, name1);
            pt.setString(2, city);
            pt.executeUpdate();
            System.out.println("Inserted data");
            con.close();

            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
}
