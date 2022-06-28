package Lab14_GUI;
//  CirclesJPanel.java
// This program draws concentric circles
import java.awt.Graphics;
import javax.swing.JPanel;

public class CirclesJPanel extends JPanel // public class JPanel  extends JComponent
{
   // draw eight Circles separated by 10 pixels
   public void paintComponent(Graphics g)  // this method is inherited from JComponent
   {
      super.paintComponent(g);

      /* write your  code starting from line 31 to drwa the 8 concentric circles
      which has 10 pixels diffrence betwwen them .
	   a)  to use:  drawArc(int x, int y, int width, int height, int startAngle,int endarcAngle).
       b)  this method draws the outline of a circular or elliptical arc covering the specified square or rectangle.
       c) (x,y):  the x and Y coordinates of the upper-left corner of the rectangle(square) covered by the arc
       d) (w,h):  the width  and height of  the upper-left corner of the rectangle(square) covered by the arc
       e) (S,E): Start angle and end angl eof the arc 
       f) Assume(x,y)=(10,25) is the the upper-left corner of the rectangle(square) covered by the arc
       g) Assume(width,height)=(160,160)is the upper-left corner of the rectangle(square) covered by the arc
      */
      int startAngle = 0;
      int endAngle  = 360;
  	   int  xu =   10;
      int  yu =   25; 
      int  wu = 160;
      int  hu= 160;
      
     for (int i = 0; i < 80; i+= 10)
     {
        /*write your own*/
        g.drawArc(xu+i, yu+i, wu-(2*i), hu-(2*i), startAngle, endAngle);
     } 
      
   } 
} // end class CirclesJPanel

