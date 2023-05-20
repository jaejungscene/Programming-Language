package Experiments;
import java.util.*;

public class test07 {
  private String name;
  public void setName(String name){
    this.name = name;
  }
  // @SuppressWarnings("unused")
  public String getName(){
    int i;
    return this.name;
  }
  static void printCollection(Collection<? extends Number> c) {
    for (Number e : c) {
        System.out.println(e);
    }
  }
  public static void main(String[] args) {
    Collection<Integer> c = new ArrayList<>();
    c.add(123);
    c.add(321);
    printCollection(c);
  }
  
}
