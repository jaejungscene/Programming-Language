package Calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Info_panel extends JPanel{

  private class topPanel extends JPanel{
    private String[] distribution_type = { "Normal", "Student-t", "F" };

    private JButton cdfButton = new JButton("cdf");
    private JComboBox<String> distribution = new JComboBox<>(distribution_type);
    private JLabel la1 = new JLabel("mean :");
    private JTextArea area1 = new JTextArea("0");
    private JLabel la2 = new JLabel("standard deviation :");
    private JTextArea area2 = new JTextArea("1");

    topPanel(){
      setBackground(Color.CYAN); /////////////
      setLayout(new FlowLayout());
      distribution.addActionListener((ActionEvent e)->{
        JComboBox s = (JComboBox)e.getSource();
        setContentAs(s.getSelectedItem().toString());
      });
      // area1.setOpaque(true);
      // area2.setOpaque(true);
      // area1.setSize(30,100);
      // area2.setSize(30,100);
      add(cdfButton);
      add(distribution);
      add(la1);
      add(area1);
      add(la2);
      add(area2);
    }

    void setContentAs(String dist_type){
      if(dist_type.equals("Normal")){
        la1.setText("mean :");
        area1.setText("0");
        la2.setText("standard deviation :");
        area2.setText("1");
        area2.setBackground(Color.WHITE);
      }
      if(dist_type.equals("Student-t")){
        la1.setText("d.f :");
        area1.setText("10");
        la2.setText("");
        area2.setText("");
        area2.setBackground(getBackground());
      }
      if(dist_type.equals("F")){
        la1.setText("d.f1 :");
        area1.setText("5");
        la2.setText("d.f2 :");
        area2.setText("2");
        area2.setBackground(Color.WHITE);
      }
      area1.setBackground(Color.WHITE);
    }
  }

  private class bottomPanel extends JPanel{
    private JButton range[] = { new JButton("]"), new JButton("[]"), new JButton("]["), new JButton("[") };

    bottomPanel(){
      setBackground(Color.GREEN);////////
      setLayout(new FlowLayout());
      for(int i=0; i<4; i++)
        add(range[i]);
    }
  }
  
  public Info_panel(){
    setBackground(Color.BLUE);

    setLayout(new GridLayout(2,1,2,2));
    add(new topPanel());
    add(new bottomPanel());
    setSize(490,200);
    setLocation(5, 320);
  }
}
