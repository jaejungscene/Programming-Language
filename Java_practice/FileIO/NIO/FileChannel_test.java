package FileIO.NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannel_test {
  public static void main(String[] args) {
    RandomAccessFile aFile;
    try {
      aFile = new RandomAccessFile("./.files/text.txt", "rw");

      FileChannel inChannel = aFile.getChannel();

      ByteBuffer buf = ByteBuffer.allocate(48);

      int bytesRead = inChannel.read(buf);
      while (bytesRead != -1) {
        System.out.println("Read " + bytesRead);
        buf.flip();
        System.out.println("-----------");
        while (buf.hasRemaining()) {        
          System.out.print((char) buf.get());
        }
        System.out.println("\n-----------");
        buf.clear();
        bytesRead = inChannel.read(buf);
        System.out.println((char)buf.get());
        System.out.println((char)buf.get());
        System.out.println(bytesRead);
      }

      aFile.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
