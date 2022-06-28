package Lab14_GUI;
import java.awt.*; // java.awt.ToolKit
import java.awt.event.*; // java.awt.event.ActionEvent and java.awt.event.ActionListener
import java.util.*; // java.util.Timer and java.util.Date”
import javax.swing.*; // javax.swing.JOptionPane
import javax.swing.Timer; // to resolve conflict with java.util.Timer

public class TimerTest
{
    public static void main(String[] args){
        class TimePrinter implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("At the tone, the time is "+ new Date());
                Toolkit.getDefaultToolkit().beep();
            }
        }
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000, listener); // fire ActionEvent Object
        t.start(); // Starts the Timer to send an action events to its listeners after 10 ,000 millisecond JOptionPane.showMessageDialog(null, "Quit program?");
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

