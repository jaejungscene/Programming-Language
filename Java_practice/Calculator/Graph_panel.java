package Calculator;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Graph_panel extends JPanel{
  protected void paintComponent(Graphics g){
    super.paintComponent(g);


  }

  Graph_panel(){
    setSize(490, 300);
    setLocation(5, 10);
    setOpaque(true);
    setBackground(Color.BLUE);
  }
}
