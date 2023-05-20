package Calculator;

import java.awt.*;
import javax.swing.*;

//참고: https://www.geogebra.org/m/Mmf3AX7y
public class Probability_Calculator extends JFrame {
  private Graph_panel graph_panel = new Graph_panel();
  private Info_panel info_panel = new Info_panel();

  public Probability_Calculator() {
    setTitle("Probability Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 700);
    setLayout(null);

    // add(graph_panel);
    // add(new top());
    add(info_panel);

    setVisible(true);
  }

  public static void main(String[] args) {
    new Probability_Calculator();
  }
}
