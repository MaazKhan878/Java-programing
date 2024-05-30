package JDBC;
import java.sql.*;
import java.util.*;
import java.util.Scanner;
public class DInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String uName = "root";
            String pswd = "maaz0101";
            Connection con = DriverManager.getConnection(url,uName,pswd);
            String q = "create table if not exists Student2(sID int not null primary key auto_increment, sName varchar(50) not null, City varchar(50) not null)";
            Statement st = con.createStatement();
            st.executeUpdate(q);
            String q2 = "insert into Student2(SName,CIty) value(?,?)";
            PreparedStatement pt = con.prepareStatement(q2);
            Scanner scan = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.print("Enter name:");
            pt.setString(1,scan.nextLine());
            System.out.print("City Name:");
            pt.setString(2, scan.nextLine());
            pt.executeUpdate();

        }
        System.out.println("Data inserted...");
        con.close();

        } catch (Exception e) {
            e.getStackTrace();
            
        }
    }
    
}
