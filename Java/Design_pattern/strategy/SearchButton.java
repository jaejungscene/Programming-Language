package Design_pattern.strategy;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class SearchButton extends JButton{
  private MyProgram myProgram;

  private SearchStrategy searchStrategy = new SearchStrategyALL(); //초기화는 all 검색

  SearchButton(MyProgram _myProgram){
    myProgram = _myProgram;
    setText("Search");
    addActionListener((ActionEvent e)->{
      String str1 = searchStrategy.search();
      String str2 = (myProgram.getSearchArea()).getText();
      myProgram.setOutputArea(String.format("%s\n%s", str1, str2));
    });
  }

  public void setSearchStrategy(SearchStrategy _searchStrategy){
    this.searchStrategy = _searchStrategy;
  }

}
