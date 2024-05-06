package SwingAPI;

import java.awt.Color;

import javax.swing.*;
import java.awt.Color;

public class Main {
    public static void main(String args[]){
      JFrame jf = new JFrame("Maaz Khan");
      jf.isFontSet();
      jf.setSize(300,500);
      jf.getContentPane().setBackground(Color.yellow);
      jf.setBounds(120, 230, 300, 200);
      JLabel jb = new JLabel("Maaz Khan",JLabel.CENTER);
      jf.add(jb);
      jf.setVisible(true);
    }
}

