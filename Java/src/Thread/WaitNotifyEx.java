package Thread;

import java.util.ArrayList;


public class WaitNotifyEx {

  public static void main(String[] args) {
    ArrayList<Integer> Buffer = new ArrayList<>();

    Thread consumer = new Thread(){
      public void run(){
        if(Buffer.size()==0){
          try{  sleep(1000); }
          catch(InterruptedException e){  return; };
        }
        System.out.println("receive "+Buffer.get(Buffer.size()-1));
        Buffer.remove(Buffer.size()-1);
      }
    };

    Thread producer = new Thread(){
      public void run(){
        int n = 0;
        while(n<=10){
          try{  sleep(1000);  }
          catch(InterruptedException e){  return; }
          System.out.println("give "+n);
          Buffer.add(n);
          n++;
          if(n>4)
            notify();
        }
      }
    };

    consumer.start();
    producer.start();
  }
}
