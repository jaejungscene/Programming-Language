package Lab15_GUI;
//  Events.java
// Program displays events that occur during execution.
import javax.swing.JFrame;

public class Events
{
   public static void main(String[] args)
   {
        /* Starting from line 12, write the code to test "EventsFrame" that dispaly 
        *  the given GUI elements 
        */
        EventsFrame eventsFrame = new EventsFrame();
        eventsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventsFrame.setSize(400, 380);
        eventsFrame.setVisible(true);
   } // end class Events
}
