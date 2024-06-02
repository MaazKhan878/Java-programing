package JDBC;
import java.io.FileInputStream;
import java.sql.*;
public class longImage {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String userName = "root";
            String password = "maaz0101";
            Connection con = DriverManager.getConnection(url,userName,password);
            String creatTable = "create table if not exists LongImage(id int primary key auto_increment, Images mediumblob not null)";
            Statement st = con.createStatement();
            st.execute(creatTable);
            String insertImage = "insert into LongImage(Images) value(?)";
            PreparedStatement ps = con.prepareStatement(insertImage);
            FileInputStream file = new FileInputStream("C:/Users/Nitro 5/Desktop/Wallpaper/715904.jpg");
            ps.setBinaryStream(1, file);
            ps.executeUpdate();
            System.out.println("inserted");

        }
        catch(Exception e){
            System.out.println("ERROR");

        }
    }
    
}
