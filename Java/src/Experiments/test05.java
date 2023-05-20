package Experiments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test05 extends JFrame{
  class canvas extends JPanel{
    private int size = 50;
    private int max = 480;

    canvas(){
      setOpaque(true);
      setBackground(Color.CYAN);
      setSize(max, 80);
    }

    public void minus(){
      if(size <= 0) return;
      size -= 10;
      repaint();
    }
    public void plus(){
      if(size >= max) return;
      size += 10;
      repaint();
    }
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      if(size <= 0) return;
      g.setColor(Color.MAGENTA);
      g.fillRect(0, 0, size, getHeight());
    }
  }

  class myL extends KeyAdapter{
    public void keyPressed(KeyEvent e){
      if(e.getSource() instanceof canvas){
        canvas bf = (canvas)(e.getSource());
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
          bf.minus();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
          bf.plus();
      }
      if(e.getSource() instanceof JButton){
        JButton bt = (JButton)(e.getSource());
        bt.setText(Integer.toString(e.getKeyCode()));
      }
    }
  }

  test05(){
    Container c = getContentPane();
    myL listener = new myL();
    c.setLayout(null);

    canvas bf = new canvas();
    bf.setLocation(9,40);
    bf.addKeyListener(listener);
    c.add(bf);

    JButton bt = new JButton("hello");
    bt.setSize(100,80);
    bt.setLocation(200,200);
    bt.addKeyListener(listener);
    c.add(bt);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setLocation(300,300);
    setVisible(true);

    System.out.println("buffer : "+bf.isFocusable());
    System.out.println("button : "+bf.isFocusable());
    // bf.setFocusable(true);
    // bt.setFocusable(true);
    bf.requestFocus();
  }

  public static void main(String[] args) {
    new test05();
  }
}
