package Socket_Programming;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Socket socket = null;
    try{
      socket = new Socket("192.168.35.248",9999);
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      while(true){
        System.out.print("Me: ");
        String outputMessage = sc.nextLine();
        if(outputMessage.equalsIgnoreCase("bye")){
          out.write(outputMessage+"\n");
          out.flush();
          break;
        }
        out.write(outputMessage+"\n");
        out.flush();
        String inputMessage = in.readLine();
        System.out.println("Server: "+inputMessage);
      }
    }catch(IOException e){
      System.out.println(e.getMessage());
    }finally{
      try{
        sc.close();
        if(socket != null) socket.close();
      }catch(IOException e){
        System.out.println("Error occurs while chatting with the Server.");
      }
    }
  }
}
