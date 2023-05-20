package Lab15_GUI;
//  Circle.java
// Program calculates the area, circumference
// and diameter for a circle and draws the circle
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Circle
{
    public static void main(String args[])
    {
        // starting from line 13, create a frame that tests  CirclesJPanel and dispaly 
	    // four figures one by one 
        String raidus = JOptionPane.showInputDialog("Enter radius:");
        String x_coordinate = JOptionPane.showInputDialog("Enter x-coordinate:");
        String y_coordinate = JOptionPane.showInputDialog("Enter y-coordinate:");

        double r = Double.parseDouble(raidus);
        int x = Integer.parseInt(x_coordinate);
        int y = Integer.parseInt(y_coordinate);

        JFrame frame = new JFrame();
        frame.setTitle("Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CirclesJPanel(r, x, y));
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
} // end class Circle

