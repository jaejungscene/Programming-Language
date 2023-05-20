package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.Image;

class myButton01 extends JButton{
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.drawRoundRect(10,10,100,100,50,50);
    g.setColor(Color.DARK_GRAY);
    g.fillRoundRect(10,10,100,100,50,50);
  }
}
class myButton02 extends JButton{
  public void paintComponent(Graphics g){
    super.paintComponent(g);

    ImageIcon icon = new ImageIcon("Images/study.jpeg");
    Image image = icon.getImage();
    g.drawImage(image,5,5,getWidth()-10,getHeight()-10,this);
  }
}

public class Paint extends JFrame{

  Paint(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(null);
    

    JButton btn = new myButton01();
    JButton b = new myButton02();
    b.setSize(200,200);
    b.setLocation(250,0);
    btn.setSize(200,200);
    btn.setLocation(0,0);
    c.add(btn);
    c.add(b);

    setSize(800, 800);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Paint();
  } 
}
