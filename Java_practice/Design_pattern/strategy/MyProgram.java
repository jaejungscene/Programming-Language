package Design_pattern.strategy;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;


public class MyProgram extends JFrame implements ActionListener{

  private JPanel searchPanel = new JPanel();
  private JTextArea searchArea = new JTextArea(1,30);
  private SearchButton searchButton = new SearchButton(this);

  private JPanel selectPanel = new JPanel();
  private JButton all = new JButton("ALL");
  private JButton image = new JButton("IMAGE");
  private JButton news = new JButton("NEWS");
  private JButton map = new JButton("MAP");

  private JTextArea outputArea = new JTextArea();
  MyProgram(){
    setTitle("test");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    makeButton(all);
    makeButton(image);
    makeButton(news);
    makeButton(map);

    selectPanel.setLayout(new FlowLayout());
    selectPanel.add(all);
    selectPanel.add(image);
    selectPanel.add(news);
    selectPanel.add(map);

    searchPanel.setLayout(new FlowLayout());
    searchPanel.add(searchArea);
    searchPanel.add(searchButton);

    setLayout(new GridLayout(3,1));
    add(selectPanel);
    add(searchPanel);
    add(outputArea);

    setSize(800,700);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    JButton temp = (JButton)e.getSource();
    all.setBackground(Color.WHITE);
    map.setBackground(Color.WHITE);
    image.setBackground(Color.WHITE);
    news.setBackground(Color.WHITE);

    if(temp.getText().equals("ALL")) 
      searchButton.setSearchStrategy(new SearchStrategyALL());
    if(temp.getText().equals("IMAGE")) 
      searchButton.setSearchStrategy(new SearchStrategyIMAGE());
    if(temp.getText().equals("NEWS")) 
      searchButton.setSearchStrategy(new SearchStrategyNEWS());
    if(temp.getText().equals("MAP")) 
      searchButton.setSearchStrategy(new SearchStrategyMAP());
    temp.setBackground(Color.ORANGE);
  }

  public void makeButton(JButton button){
    button.setSize(30, 20);
    button.setBackground(Color.WHITE);
    button.addActionListener(this);
    button.setOpaque(true);
	  button.setBorderPainted(false);
  }
  public JTextArea getSearchArea(){
    return searchArea;
  }
  public void setOutputArea(String str){
    outputArea.setText(str);
  }

}
