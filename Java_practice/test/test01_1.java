package test;

public class test01_1 {
  public static void main(String[] args) {
    test01_1 t = new test01_1();
    if(t instanceof Object)
      System.out.println("t is Object");
    if(t instanceof test01_1)
      System.out.println("t is test01_1");
    t = null;
    if(t == null)
      System.out.println("t is null");
    else
      System.out.println("t is not null");

  } 
}
