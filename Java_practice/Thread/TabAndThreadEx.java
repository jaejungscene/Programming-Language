package Thread;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// java thread 상태 제어
// https://widevery.tistory.com/28

class Buffer extends JLabel{
  private int barSize = 0;
  private int num = 0;
  private int maxBarSize;

  Buffer(int maxBarSize){
    this.maxBarSize = maxBarSize;
    setOpaque(true);
    setBackground(Color.ORANGE);
    setSize(maxBarSize, 80);
    addKeyListener(new KeyAdapter(){
      public void keyPressed(KeyEvent e){
        fill();
      }
    });
    setFocusable(true);
    requestFocus();
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.MAGENTA);
    if(barSize == 0) return;
    g.fillRect(0, 0, barSize, getHeight());
    g.setColor(Color.DARK_GRAY);
    for(int i=0; i<num; i++){
      g.drawLine(10+(i*10), 0, 10+(i*10), getHeight());
    }
  }

  synchronized public void consume(){
    if(barSize <= 0){
      try{
        wait();
      }
      catch(InterruptedException e){ return; };
    }
    barSize -= 10;
    num--;
    repaint();
    notify();
  }

  synchronized public void fill(){
    if(barSize == maxBarSize){
      try{
        wait();
      }
      catch(InterruptedException e){ return; }
    }
    barSize += 10;
    num++;
    repaint();
    notify();
  }
}

class consumerThread extends Thread{
  private Buffer bf;
  private int num;

  consumerThread(Buffer bf, int num){
    this.bf = bf;
    this.num = num;
  }

  public void run(){
    while(true){
      try{
        sleep(num);
      }catch(InterruptedException e){ return; }
      bf.consume();
    }
  }
}

public class TabAndThreadEx extends JFrame{
  TabAndThreadEx(){
    Container c = getContentPane();
    c.setLayout(null);

    Buffer bf = new Buffer(480);
    c.add(bf);
    bf.setLocation(9,40);
    System.out.println(bf.isFocusable());
    // bf.addKeyListener(new KeyAdapter(){
    //   public void keyPressed(KeyEvent e){
    //     bf.fill();
    //   }
    // });
    // bf.setFocusable(true);
    // bf.requestFocus();

    // c.addKeyListener(new KeyAdapter(){
    //   public void keyPressed(KeyEvent e){
    //     bf.fill();
    //   }
    // });
    // c.setFocusable(true);
    // c.requestFocus();

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,200);
    setLocation(300,300);
    setVisible(true);

    consumerThread th1 = new consumerThread(bf,1000);
    consumerThread th2 = new consumerThread(bf,3000);
    consumerThread th3 = new consumerThread(bf,5000);

    th1.start();
    th2.start();
    th3.start();

  }


  public static void main(String[] args) {
    new TabAndThreadEx();
  }
}
