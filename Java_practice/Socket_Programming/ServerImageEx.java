package Socket_Programming;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerImageEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Socket socket = null;
    ServerSocket listener = null;
    try{
      listener = new ServerSocket(9999);
      System.out.println("waiting connection...");
      socket = listener.accept();
      System.out.println(
        "connected with (IP:"+socket.getInetAddress()+","+socket.getLocalAddress()
        +" Port:"+socket.getPort()+","+socket.getLocalPort()+")");
      BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
      BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
      while (true) {
        int request = in.read();
        if(request == 0){
          System.out.println("Connection is ended...");
          break;
        }
        File image = new File(String.format("C:\\Users\\ljj05\\projects\\java_practice\\java\\src\\.files\\0%d.jpg", request));
        FileInputStream fi = new FileInputStream(image);
        byte b[] = new byte[100000];
        int size = fi.read(b, 0, 100000);
        out.write(b,0,size);
        System.out.println(image.getClass().getName()+" is sended to ("+socket.getInetAddress()+","+socket.getPort()+")");
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        sc.close();
        socket.close();
        listener.close();
      }catch(IOException e){
        System.out.println("Error occurs while chatting with the client.");
      }
    }
  }
}
