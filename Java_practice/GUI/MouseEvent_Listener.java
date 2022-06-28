package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvent_Listener extends JFrame implements MouseListener, MouseMotionListener{
  // private JButton la = new JButton("Move me");
  private JButton la = new JButton();
  MouseEvent_Listener(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();

    c.setLayout(null);
    c.add(la);
    c.addMouseListener(this);
    c.addMouseMotionListener(this);
    la.setSize(20,20);
    la.setLocation(250,250);
    la.addMouseListener(this);
    la.addMouseMotionListener(this);

    setSize(500, 500);
    setVisible(true);
  }

  public static void main(String[] args) {
    new MouseEvent_Listener();
  }

  public void mousePressed(MouseEvent e){
    Point p = la.getLocation();
    setTitle("mousePressed("+(e.getX()+p.x)+","+(e.getY()+p.y)+")");
  }
  public void mouseReleased(MouseEvent e){
    Point p = la.getLocation();
    setTitle("mouseReleased("+(e.getX()+p.x)+","+(e.getY()+p.y)+")");
  }
  public void mouseEntered(MouseEvent e){
    getContentPane().setBackground(Color.CYAN);
    la.setLocation(e.getX(),e.getY());
  }
  public void mouseExited(MouseEvent e){
    getContentPane().setBackground(Color.YELLOW);
    if(e.getSource() instanceof JButton){
      Point p = la.getLocation();
      la.setLocation((e.getX()+p.x-10),(e.getY()+p.y-10));
    }
    else{
      la.setLocation(e.getX(),e.getY());
    }
  }
  public void mouseClicked(MouseEvent e){}
  public void mouseDragged(MouseEvent e){
    getContentPane().setBackground(Color.GREEN);
    if(e.getSource() instanceof JButton){
      Point p = la.getLocation();
      setTitle("mouseDragged("+(e.getX()+p.x)+","+(e.getY()+p.y)+")");
      la.setLocation((e.getX()+p.x-10),(e.getY()+p.y-10));
    }
    else{
      setTitle("mouseDragged("+e.getX()+","+e.getY()+")");
      la.setLocation(e.getX(),e.getY());
    }
  }
  public void mouseMoved(MouseEvent e){
    if(e.getSource() instanceof JButton){
      Point p = la.getLocation();
      setTitle("mouseMoved("+(e.getX()+p.x)+","+(e.getY()+p.y)+")");
      la.setLocation((e.getX()+p.x-10),(e.getY()+p.y-10));
    }
    else{
      setTitle("mouseMoved("+e.getX()+","+e.getY()+")");
      la.setLocation(e.getX(),e.getY());
    }
  }
}