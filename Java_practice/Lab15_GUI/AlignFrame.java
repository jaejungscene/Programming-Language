package Lab15_GUI;
//  AlignFrame.java
// Program creates a simple GUI.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlignFrame extends JFrame 
{
    // Starting from line 17, write your code that creates and dispaly the given GUI application.
    //  Use the given guideline to write your code.
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_4;
    private JPanel panel_5;

    public AlignFrame(){
        panel_1 = new JPanel(new GridLayout(2,1));
        makeCheckBox("Snap to Grid");
        makeCheckBox("Show Grid");

        panel_2 = new JPanel(new FlowLayout());
        makeJLabelAndJTextField(panel_2,"X:", 8);
        panel_3 = new JPanel(new FlowLayout());
        makeJLabelAndJTextField(panel_3,"Y:", 8);

        panel_4 = new JPanel(new BorderLayout());
        panel_4.add(panel_2, BorderLayout.NORTH);
        panel_4.add(panel_3, BorderLayout.SOUTH);

        panel_5 = new JPanel(new GridLayout(3,1,10,5));
        makeButton("Ok");
        makeButton("Cancel");
        makeButton("Help");

        setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        add(panel_1);
        add(panel_4);
        add(panel_5);
        pack();
    }
    
    public void makeCheckBox(String name){
        panel_1.add(new JCheckBox(name));
    }

    public void makeJLabelAndJTextField(JPanel panel,String name, int size){
        panel.add(new JLabel(name));
        panel.add(new JTextField(size));
    }

    public void makeButton(String name){
        panel_5.add(new JButton(name));
    }
	
} // end class AlignFrame