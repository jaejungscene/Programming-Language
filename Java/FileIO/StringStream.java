package FileIO;
import java.io.*;
import java.util.Scanner;

public class StringStream {
  public static void main(String[] args) {
    File f = new File("./.files/text.txt");
    try {
      Scanner sc = new Scanner(f);
      System.out.println(sc.nextLine());
      System.out.println(sc.nextLine());
      sc.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    Scanner sc = new Scanner(System.in);
    try {
      FileWriter fw = new FileWriter("./.files/text.txt");
      fw.append(sc.nextLine());
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
