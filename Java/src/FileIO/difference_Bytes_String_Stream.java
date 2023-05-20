package FileIO;
import java.io.*;

public class difference_Bytes_String_Stream {
  public static void main(String[] args) {
    File f = new File(".files/text.txt");

    try {
      FileReader fr = new FileReader(f);
      FileInputStream fi = new FileInputStream(f);
      FileInputStream fi1 = new FileInputStream(f);

      int c, n=0; 
      System.out.println(f.length()+"\n");

      while((c=fr.read()) != -1){
        System.out.print(Integer.toHexString(c)+" ");
        n++;
      }
      System.out.println("\n"+n);
      // text로 읽어 들임
      //  a |  s |  d |  f | \n |  안  |  녕
      // unicode로 변환
      // 61 | 73 | 64 | 66 |  a | c548 | b155 

      System.out.println();
      n=0;
      while((c=fi.read()) != -1){
        System.out.print(Integer.toHexString(c)+" ");
        n++;
      }
      System.out.println("\n"+n);
      // binary 그대로 읽어 들임
      //  a |  s |  d |  f | \n |    안    |    녕
      // UTF-8로 encoding시 한국어는 3bytes로 encoding 됨
      // 61 | 73 | 64 | 66 |  a | ec 95 88 | eb 85 95

      System.out.println();
      n=0;
      byte b[] = new byte[20];
      c = fi1.read(b,0,20);
      for(int i=0; i<b.length; i++)
        System.out.print(Integer.toHexString(b[i])+" ");
      System.out.println("\n"+c);
      File text = new File(".files/text01.txt");
      FileOutputStream fo = new FileOutputStream(text);
      fo.write(b,0,c);


      fr.close();
      fi.close();
      fi1.close();
      fo.close();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
