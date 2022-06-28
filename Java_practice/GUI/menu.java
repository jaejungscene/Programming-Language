package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame{
  JLabel la = new JLabel();
  JFrame my = this;

  menu(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("뭘봐");
    Container c = getContentPane();
    myListener listener =  new myListener();

    JMenuBar menuBar = new JMenuBar();
    menuBar.setBackground(Color.CYAN);
    JMenu screen = new JMenu("Screen");
    screen.setBackground(Color.CYAN);
    JMenu settings = new JMenu("Settings");

    JMenuItem load = new JMenuItem("Load picture");
    load.addActionListener(listener);
    JMenuItem hide = new JMenuItem("Hide");
    hide.addActionListener(listener);
    JMenuItem reshow = new JMenuItem("Reshow");
    reshow.addActionListener(listener);
    JMenuItem exit = new JMenuItem("Exit");
    exit.addActionListener(listener);

    screen.add(load);
    screen.add(hide);
    screen.add(reshow);
    screen.add(exit);
    menuBar.add(screen);
    menuBar.add(settings);
    c.add(la);
    setJMenuBar(menuBar);

    setSize(500,500);
    setVisible(true);
  }

  class myListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      String cmd = e.getActionCommand();
      switch(cmd){
        case "Load picture":
          if(la.getIcon() != null) return;
          la.setIcon(new ImageIcon("./.files/Images/test_image01.jpeg")); break;
        case "Hide":
          la.setVisible(false); break;
        case "Reshow":
          la.setVisible(true); break;
        case "Exit":
          int result = JOptionPane.showConfirmDialog(my, "종료하시겠습니까?", "Exit", JOptionPane.YES_NO_OPTION);
          if(result == JOptionPane.YES_OPTION){
            System.exit(0); break;
          }
          else
            break;
      }

    }
  }

  public static void main(String[] args) {
    new menu();
  }
}
