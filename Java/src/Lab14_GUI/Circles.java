package Lab14_GUI;
//  Circles.java
// This program draws concentric circles
import javax.swing.JFrame;
import java.awt.EventQueue;

public class Circles extends JFrame 
{
     public static void main(String args[])
     {
	     /*write your own code to test  the Circles class .*/
	     EventQueue.invokeLater
          (()->{
             Circles c = new Circles();
             c.setTitle("Concentric Circles");
             c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //  c.add(new CirclesJPanel());
             c.add(new CirclesJPanel2());
             c.setSize(200,250);
             c.setVisible(true);
          });

   } // end main
} // end class Circles
