package GUI;
import javax.swing.*;
import java.awt.*;

public class Image extends JFrame{
  Image(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon image = new ImageIcon("./.files/study.jpeg");
    JLabel btn = new JLabel(image);
    btn.isOpaque();
    JButton jb = new JButton("qwer");
    Container c = getContentPane();
    // c.setLayout(null);
    c.add(btn, BorderLayout.EAST);
    c.add(jb, BorderLayout.WEST);
    // btn.setSize(200,200);
    // btn.setLocation(150,150);
    setSize(500,500);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Image();
  }
  
}
