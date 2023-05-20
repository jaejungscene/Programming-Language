package Experiments;
import java.io.*;

public class test06 {
  public static void main(String[] args) {
    // File src = new File("/Users/jaejungscene/Desktop/Projects/java_practice/Images/study.jpeg");
    // File dest = new File("/Users/jaejungscene/Desktop/Projects/java_practice/Images/02.out");

    // int c;
    // try{
    //   FileInputStream fi = new FileInputStream(src);
    //   FileOutputStream fo = new FileOutputStream(dest);

    //   while((c=fi.read()) != -1){
    //     fo.write((byte)c);
    //   }
    //   fi.close();
    //   fo.close();
    //   System.out.println("Successfully complete\n");
    // } catch(IOException e){
    //   System.out.println("Error!!\n");
    // }
    InputStreamReader rd = new InputStreamReader(System.in);
    while(true){
      try {
        char c = (char)rd.read();
        System.out.println(c);
        if(c==-1) break;
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
  }
  
}
