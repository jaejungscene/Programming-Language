package Socket_Programming;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientImageEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Socket socket = null;
    try{
      socket = new Socket("192.168.35.248",9999);
      BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
      BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
      while (true) {
        System.out.print("Enter image number (1) (2) (3) or Enter (0) to exit >> ");
        int cmd = sc.nextInt();
        if(cmd==0){
          out.write(cmd);
          out.flush();
          break;          
        }
        out.write(cmd);
        out.flush();
        byte b[] = new byte[100000];
        cmd = in.read(b,0,100000);
        File image = new File("./.files/image.jpeg");
        FileOutputStream fo = new FileOutputStream(image);
        fo.write(b,0,cmd);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try {
        sc.close();
        if (socket != null)
          socket.close();
      } catch (IOException e) {
        System.out.println("Error occurs while communicating with the Server.");
      }
    }
  }
}
