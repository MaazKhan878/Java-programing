
package JDBC;
import java.io.*;
import java.sql.*;
import javax.swing.*;
public class StoreImgToDataBase {

    public static void main(String[] args) {
        
        try {
            Connection c = JDBC.ConnectionCreator.getConnect();
            String q = "create table if not exists LargeImages(id int primary key auto_increment, Pic longblob not null)";
            Statement st = c.createStatement();
            st.executeUpdate(q);
            String iq = "insert into LargeImages(Pic) value(?)";
            PreparedStatement sti = c.prepareStatement(iq);
            JFileChooser jf = new JFileChooser();
            jf.showOpenDialog(null);
            File file = jf.getSelectedFile();
            FileInputStream fs = new FileInputStream(file);
            sti.setBinaryStream(1, fs,fs.available());
            sti.executeUpdate();
            JOptionPane.showMessageDialog(null,"Done");
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Error");
        }
    }
    
}
