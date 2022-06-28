package Thread;

public class Sample_Runnable implements Runnable{
  int seq;
  
  public Sample_Runnable(int seq) {
    this.seq = seq;
  }
  
  public void run() {
    System.out.println(this.seq + " thread start.");  // 쓰레드 시작
    try {
      Thread.sleep(2000);  // 2초 대기한다.
    } catch (Exception e) { return; }
    System.out.println("result of calculation of "+this.seq+" thread is "+(Math.random()+Math.random()));
    try {
      Thread.sleep(2000);  // 2초 대기한다.
    } catch (Exception e) { return; }
    System.out.println(this.seq + " thread end.");  // 쓰레드 종료 
  }
  
  public static void print(){
    System.out.println("hello");
  }
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
      Thread t = new Thread(new Sample_Runnable(i));
      t.start();
      // try{
      //   t.join();
      // }
      // catch(Exception e){ return; }
    }
    System.out.println("main end.");  // main 메소드 종료
  }
}
