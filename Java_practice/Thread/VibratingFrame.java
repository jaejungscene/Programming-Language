package Thread;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class VibratingFrame extends JFrame {
  private Thread th;
  private Runnable R = new Runnable() {
    public void run(){
      Random r = new Random();
      while(true){
        try{
          Thread.sleep(20);
        }
        catch(InterruptedException e){
          return;
        }
        int x = getX() + r.nextInt()%5;
        int y = getY() + r.nextInt()%5;
        setLocation(x,y);
      }
    }
  };

  public VibratingFrame(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,300);
    setLocation(300,300);
    setVisible(true);

    getContentPane().addMouseListener(new MouseAdapter(){
      public void mousePressed(MouseEvent e){
        if(!th.isAlive()){
          th = new Thread(R);
          th.start();
          return;
        }
        th.interrupt();
      }
    });
    th = new Thread(R);
    th.start();
  }

  public static void main(String[] args) {
    new VibratingFrame();
  }
}
