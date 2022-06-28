package Lab14_GUI;
//  Concentric.java
// This program draws concentric circles using Graphics2D
import javax.swing.JFrame;
import java.awt.EventQueue;

public class Concentric extends JFrame 
{
  public static void main(String args[])
  {
    /* write your code to test "CirclesPanel2" class */  
    EventQueue.invokeLater
    (()->{
      Circles c = new Circles();
      c.setTitle("Concentric Circles");
      c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      c.add(new CirclesJPanel());
      c.setSize(200,250);
      c.setVisible(true);
    });
  } 
} // end class Concentric

