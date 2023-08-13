package Design_pattern.Behavioral.strategy;

public class MyProgram {
    private SearchButton searchButton = new SearchButton(this);

    public Mode mode = Mode.ALL;
    public void setModeAll() {
        searchButton.setSearchStrategy(new SearchStrategyAll());
//        mode = Mode.ALL;
    }
    public void setModeImage() {
        searchButton.setSearchStrategy(new SearchStrategyImage());
//        mode = Mode.IMAGE;
    }

    public void testProgram(){
        searchButton.onClick();

        setModeImage();
        searchButton.onClick();

        setModeAll();
        searchButton.onClick();
    }
}
