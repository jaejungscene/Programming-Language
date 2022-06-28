package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEvent_Listener extends JFrame{

  private JButton l = new JButton("press");
  String str[] = {"asdf", "qwer", "zxcv"};
  private JComboBox<String> b = new JComboBox<>(str);
  private JButton la = new JButton("mouse");
  KeyEvent_Listener(){
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(2,1));
    
    // l.setOpaque(true);
    // l.setBorderPainted(false);

    JPanel panel1 = new JPanel();
    panel1.setBackground(Color.BLACK);
    // panel1.setLayout(null); //있든 없든상관없음
    panel1.add(la);
    la.setLocation(50, 50);
    la.setSize(90,30);
    // la.setOpaque(true);
    // la.setBorderPainted(false);
    // la.setBackground(Color.BLUE);

    JPanel panel2 = new JPanel();
    panel2.setLayout(new FlowLayout());
    panel2.add(l);
    panel2.add(b);

    l.addKeyListener(new my1());
    la.addKeyListener(new my2());

    pane.add(panel2);
    pane.add(panel1);

    setTitle("hello");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setVisible(true);

    // la.setFocusable(true);
    l.requestFocus();
  }

  private class my1 extends KeyAdapter{
    @Override
    public void keyPressed(KeyEvent e){
      JButton l = (JButton)e.getSource();
      l.setText(Integer.toString(e.getKeyCode()));
    }
  }

  private class my2 extends KeyAdapter{
    @Override
    public void keyPressed(KeyEvent e){
      JButton label = (JButton)e.getSource();
      int keyCode = e.getKeyCode();
      switch(keyCode){
        case KeyEvent.VK_UP:
          label.setLocation(label.getX(), label.getY()-10); break;
        case KeyEvent.VK_DOWN:
          label.setLocation(label.getX(), label.getY()+10); break;
        case KeyEvent.VK_LEFT:
          label.setLocation(label.getX()-10, label.getY()); break;
        case KeyEvent.VK_RIGHT:
          label.setLocation(label.getX()+10, label.getY()); break;
      }
    }
  }
  public static void main(String[] args) {
    new KeyEvent_Listener();
  }
}
