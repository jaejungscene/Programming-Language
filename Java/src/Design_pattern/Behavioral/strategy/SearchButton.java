package Design_pattern.Behavioral.strategy;

public class SearchButton {
    private MyProgram myProgram;

    public SearchButton(MyProgram myProgram) {
        this.myProgram = myProgram;
    }

    private SearchStrategy searchStrategy = new SearchStrategyAll(); //default search strategy

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void onClick() {
        searchStrategy.search();
        /*
        if(myProgram.mode == Mode.ALL){
            System.out.println("search ALL");
            // ...
        } else if (myProgram.mode == Mode.IMAGE) {
            System.out.println("search IMAGE");
            // ...
        }
        */
    }
}
