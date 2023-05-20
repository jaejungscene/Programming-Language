package Lab14_GUI;
// CirclesJPanel2.java
// This program draws concentric circles using Graphics2D
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class CirclesJPanel2 extends JPanel 
{
   // draw eight concentric circles separated by 10 pixels
   public void paintComponent(Graphics g1)
   {
      super.paintComponent(g1);
      /*write your code starting from line 20 to draw the Eclipse by filling the following blank space as follows. 
      a)  use:  public abstract void draw(Shape s) from java.awt.Graphics2D
      b)  check:  java.awt. Shape (interface) 
      c)  use: java.awt.geom.Ellipse2D.Double(Double x,Double y,Double w,Double h) implements Shape,
          where (X,Y) are  coordinates of the upper-left corner of  rectangle covering the eclipse
      */
      Graphics2D g2 = (Graphics2D)g1;
      double xu = 25;
      double yu = 25; 
      double wu = 160;
      double hu = 160;
      Ellipse2D.Double circle = new Ellipse2D.Double(xu, yu, wu, hu);
      for(int i=10; i<=80; i+=10){
         g2.draw(circle);
         circle.setFrame(xu+i, yu+i, wu-(2*i), hu-(2*i));
      }
   }
} // end class CirclesJPanel
// Hint 1: Read draw() of Graphics2D class from java API
// Hint 2: Read  the constuctor Ellipse2D.Double(x,y,w,h) from java API
