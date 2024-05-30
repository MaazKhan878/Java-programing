package JDBC;

import java.sql.*;
import java.util.*;
import java.io.*;
public class insertImage {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String uName = "root";
            String pswd = "maaz0101";
            Connection con = DriverManager.getConnection(url,uName,pswd);
            String q = "insert into images(pic) value(?)";
            PreparedStatement pt = con.prepareStatement(q);
            FileInputStream file = new FileInputStream("C:/Users/Nitro 5/Downloads/715904_optimized_50.jpg");
            pt.setBinaryStream(1,file,file.available());
            pt.executeUpdate();
            System.out.println("Inserted");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
}
