package Lab14_GUI;
import javax.swing.JFrame;
import java.awt.EventQueue;

public class DrawRectangles extends JFrame
{
	public static void main(String arg[])
	{
    	// write your code starting from line 9 to test "RectanglesPanel" class that draws  10 nested rectangles  
		EventQueue.invokeLater
		(()->{
			DrawRectangles drawRect = new DrawRectangles();
			drawRect.setTitle("Nested Rectangles");
			drawRect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			drawRect.add(new RectanglesPanel());
			drawRect.setSize(400,400);
			drawRect.setVisible(true);
		});
	}
}
