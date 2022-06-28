package Lab14_GUI;

// Draw nested rectangles
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class RectanglesPanel extends JPanel // Jpanel child of JComponent 
{
	
	public void paintComponent(Graphics g)  
	{
		super.paintComponent(g);
	 	// write your code starting from line 17 to draw 10 nested rectangles
	 	// note that  (x,y)=(150,150) and (w,h)=(50,30) for the most inner rectangle. 
		Graphics2D g1 = (Graphics2D)g;
		double x = 150.;
		double y = 150.;
		double w = 50.;
		double h = 30.;
		Rectangle2D rect = new Rectangle2D.Double();
		for(int i=0; i<100 ; i+=10){
			rect.setFrame(x-i, y-i, w+(2*i), h+(2*i));
			g1.draw(rect);
		}
  	}
}
