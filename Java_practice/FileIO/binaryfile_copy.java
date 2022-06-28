package FileIO;
import java.io.*;

public class binaryfile_copy {
  public static void main(String[] args) {
    File src = new File("./.files/Images/study.jpeg");
    File dest1 = new File("./.files/Images/test01.jpeg");

    try {
      int c;
      FileInputStream in = new FileInputStream(src);
      FileOutputStream out1 = new FileOutputStream(dest1);

      while((c=in.read()) != -1){
        out1.write((byte)c);
      }
      in.close();
      out1.close();
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }

  }
  
}
