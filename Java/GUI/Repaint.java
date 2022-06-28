package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Repaint extends JFrame{ 
  private MyPanel myPanel = new MyPanel("Oval");
  private JMenuBar menuBar = new JMenuBar();
  ActionListener listener =  new ActionListener(){
    public void actionPerformed(ActionEvent e){
      String cmd = e.getActionCommand();
      if(cmd.equals("Exit")){
        int result = JOptionPane.showConfirmDialog(getContentPane(), "종료하시겠습니까?", "Exit", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
          System.exit(0);
      }
      else
        myPanel.setType(cmd);
    }
  };

  Repaint(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(myPanel);
    makeMenuBar();
    setJMenuBar(menuBar);
    setSize(500,500);
    setVisible(true);
  }

  private void makeMenuBar(){
    JMenu type = new JMenu("Draw types");
    JMenu settings = new JMenu("Settings");

    JMenuItem type1 = new JMenuItem("Oval");
    JMenuItem  type2 = new JMenuItem("Rect");
    JMenuItem  type3 = new JMenuItem("Free drawing");
    type1.addActionListener(listener);
    type2.addActionListener(listener);
    type3.addActionListener(listener);
    type.add(type1);
    type.add(type2);
    type.add(type3);

    JMenuItem exit = new JMenuItem("Exit");
    exit.addActionListener(listener);
    settings.add(exit);

    menuBar.add(type);
    menuBar.add(settings);
  }

  class MyPanel extends JPanel{
    private String type;
    private Point start=null, end=null;

    MyPanel(String str){
      type = str;
      myListener listener = new myListener();
      addMouseListener(listener);
      addMouseMotionListener(listener);
    }

    class myListener extends MouseAdapter{
      public void mousePressed(MouseEvent e){
        start = e.getPoint();
      }
      public void mouseDragged(MouseEvent e){
        end = e.getPoint();
        repaint();
      }
    }

    public void setType(String str){
      this.type = str;
    }

    public void paintComponent(Graphics g){
      super.paintComponent(g);

      g.setColor(Color.BLUE);
      g.drawRect(5, 5, getWidth()-10, getHeight()-10);
      if(start==null)
        return;
      int x1 = Math.min((int)start.getX(), (int)end.getX());
      int y1 = Math.min((int)start.getY(), (int)end.getY());
      int x2 = Math.max((int)start.getX(), (int)end.getX());
      int y2 = Math.max((int)start.getY(), (int)end.getY());

      if(type.equals("Oval"))
        g.drawOval(x1, y1, x2-x1, y2-y1);
      else  if(type.equals("Rect"))
        g.drawRect(x1, y1, x2-x1, y2-y1);
      else{
        g.fillOval(x1, y1, 5, 5);
      }
      // int x = Math.min((int)start.getX(), (int)end.getX());
      // int y = Math.min((int)start.getY(), (int)end.getY());
      // int width = Math.abs((int)start.getX()-(int)end.getX());
      // int height = Math.abs((int)start.getY()-(int)end.getY());
      // g.drawOval(x, y, width, height);
    }
  }

  public static void main(String[] args) {
    new Repaint();
  }
}
