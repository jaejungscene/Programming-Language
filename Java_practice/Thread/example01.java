package Thread;

class myThread extends Thread{
  int seq = 1;
  public myThread(int seq){ this.seq = seq; }
  public void run(){
    System.out.println("Thread "+this.seq+" : START");
    // example01.syncPrint(this);
    example01.ascyncPrint(this);
    System.out.println("Thread "+this.seq+" : END");
  }
}

public class example01 {
  static synchronized void syncPrint(myThread temp){ // 순차적으로 thread가 들어감
    System.out.println("Thread "+temp.seq+" : processing...");
    try{
      Thread.sleep(2000);
    }catch(Exception e){ return; }
    System.out.println("Thread "+temp.seq+" : processing finish!");
  }
  static void ascyncPrint(myThread temp){ // 비순차적으로 thread가 들어감
    System.out.println("Thread "+temp.seq+" : processing...");
    try{
      Thread.sleep(2000);
    }catch(Exception e){ return; }
    System.out.println("Thread "+temp.seq+" : processing finish!");
  }
  public static void main(String[] args) {
    myThread thread01 = new myThread(1);
    myThread thread02 = new myThread(2);
    myThread thread03 = new myThread(3);
    thread01.start();
    thread02.start();
    thread03.start();
  }  
}
