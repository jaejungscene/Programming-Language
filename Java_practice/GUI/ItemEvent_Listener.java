package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ItemEvent_Listener extends JFrame{
  private JCheckBox list[] = new JCheckBox[3];
  private JLabel priceList = new JLabel("사과:100원, 배:500원, 체리:20000원");
  private JLabel sumOfPrice = new JLabel();
  private int sum = 0;
  ItemEvent_Listener(){
    list[0] = new JCheckBox("사과");
    list[1] = new JCheckBox("배");
    list[2] = new JCheckBox("체리");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(priceList);
    for(int i=0; i<3; i++){
      list[i].addItemListener(new myListener());
      c.add(list[i]);
    }
    sumOfPrice.setText("현재 0원 입니다");
    c.add(sumOfPrice);

    setSize(250,200);
    setVisible(true);
  }

  public static void main(String[] args) {
    new ItemEvent_Listener();
  }

  class myListener implements ItemListener{
    public void itemStateChanged(ItemEvent e){
      if(e.getStateChange() == ItemEvent.SELECTED){
        if(e.getItem() == list[0])
          sum += 100;
        else if(e.getItem() == list[1])
          sum += 500;
        else 
          sum += 20000;
      }
      else{
        if(e.getItem() == list[0])
         sum -= 100;
        else if(e.getItem() == list[1])
          sum -= 500;
        else 
          sum -= 20000;
      }
      sumOfPrice.setText("현재 "+sum+"원 입니다");
    }
  }
}
