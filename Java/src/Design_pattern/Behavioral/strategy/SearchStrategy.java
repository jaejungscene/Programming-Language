package Design_pattern.Behavioral.strategy;

interface SearchStrategy {
  public String search();
}

class SearchStrategyALL implements SearchStrategy{
  public String search(){
    return "--ALL--";
  }
}

class SearchStrategyIMAGE implements SearchStrategy{
  public String search(){
    return "--IMAGE--";
  }
}

class SearchStrategyNEWS implements SearchStrategy{
  public String search(){
    return "--NEWS--";
  }
}

class SearchStrategyMAP implements SearchStrategy{
  public String search(){
    return "--MAP--";
  }
}