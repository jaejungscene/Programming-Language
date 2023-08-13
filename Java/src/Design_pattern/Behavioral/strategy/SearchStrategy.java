package Design_pattern.Behavioral.strategy;

public interface SearchStrategy {
    public void search();
}

class SearchStrategyAll implements  SearchStrategy{
    public void search() {
        System.out.println("search ALL");
        // ...
    }
}

class SearchStrategyImage implements SearchStrategy {
    public void search() {
        System.out.println("search IMAGE");
        // ...
    }
}
