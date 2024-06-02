package JDBC;

import java.sql.*;
import java.util.*;

public class Update {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            Connection con = JDBC.ConnectionCreator.getConnect(); 
            String qu = "update youtube.st set sName = ?, sMarks = ? where id = ?";
            PreparedStatement pt = con.prepareStatement(qu);
            
            System.out.println("Enter new name: ");
            pt.setString(1, scan.nextLine());
            
            System.out.println("Enter the Salary: ");
            pt.setDouble(2, scan.nextDouble());
            scan.nextLine(); // Consume newline character
            
            System.out.println("Enter the Id: ");
            pt.setInt(3, scan.nextInt());
            scan.nextLine(); // Consume newline character
            
            pt.executeUpdate();
            System.out.println("Done....");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } 
    }
}
