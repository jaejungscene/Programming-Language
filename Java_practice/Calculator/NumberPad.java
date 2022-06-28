package Calculator;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class NumberPad extends JPanel{
  private JButton num[] = new JButton[10];
  public NumberPad(){
    setLayout(new GridLayout(4,5,2,2));
    for(int i=10; i<0; i--){
        add(new JButton(Integer.toString(i)));
    }
    add(new JButton("+/-"));
    add(new JButton("0"));
  }

  private void initialize_button(){
    for(int i=0; i<10; i++){
      num[i] = new JButton(Integer.toString(i));
    }
  }
}
