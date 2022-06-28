package Socket_Programming;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
  public static void main(String[] args) {
    BufferedReader in = null;
    BufferedWriter out = null;
    ServerSocket listener = null;
    Socket socket = null;
    Scanner sc = new Scanner(System.in);
    try{
      listener = new ServerSocket(9999);
      System.out.println("Waiting connection with others....");
      socket = listener.accept();
      System.out.println(
        "connected with (IP:"+socket.getInetAddress()+","+socket.getLocalAddress()
        +" Port:"+socket.getPort()+","+socket.getLocalPort()+")");
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      while(true){
        String inputMessage = in.readLine();
        if(inputMessage.equalsIgnoreCase("bye")){
          System.out.println("the Client ends the connection by \"bye\".");
          break;
        }
        System.out.println("Client: "+inputMessage);
        System.out.print("Me: ");
        String outputMessage = sc.nextLine();
        out.write(outputMessage+"\n");
        out.flush();
      }
    }catch(IOException e){
      System.out.println(e.getMessage());
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
