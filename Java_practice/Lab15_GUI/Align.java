package Lab15_GUI;
//Align.java
// Testing AlignFrame.
import javax.swing.JFrame;

public class Align 
{
    public static void main(String[] args)
    {
  	    // starting from line 10, write your code to test "AlignFrame" class
        AlignFrame alignFrame = new AlignFrame();
        alignFrame.setTitle("Align");
        alignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        alignFrame.setSize(400,140);
        alignFrame.setVisible(true);
    } 
} // end class Align


