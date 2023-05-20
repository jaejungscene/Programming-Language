package FileIO;
import java.io.*;
public class BytesStream {
  public static void main(String[] args) {
    try {
      FileOutputStream out = new FileOutputStream("/Users/jaejungscene/Desktop/Projects/java_practice/.files/text.txt");
      try{
        int b = 97;
        out.write(b);
      }catch(IOException e){
        e.printStackTrace();
      }
      FileInputStream in = new FileInputStream("/Users/jaejungscene/Desktop/Projects/java_practice/.files/text.txt");
      try {
        int c, n=0;
        byte b[] = new byte[26];
        in.read(b);
        for(int i=0; i<20; i++)
          System.out.print((char)b[i]);

        c = ((b[20]<<16)|(b[21]<<8))|(b[22]);
        c = b[20];
        System.out.println(c+" "+b[21]+" "+b[22]);
        c = ((b[23]<<16)|(b[24]<<8))|(b[25]);
        System.out.println(b[23]+" "+b[24]+" "+b[25]);

        char korean = '안';
        System.out.println("\n"+(int)korean);
        korean = '녕';
        System.out.println(+(int)korean);
        // while((c=in.read())!=-1){
        //   n++;
        //   System.out.print((char)c);
        // }
        // System.out.println("\n"+n+" Bytes");
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
