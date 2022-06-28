package Thread;
public class Sample_Thread extends Thread {
  int seq;

  public Sample_Thread(int seq) {
    this.seq = seq;
  }

  public void run() {
    System.out.println(this.seq + " thread start.");  // 쓰레드 시작
    long id = Thread.currentThread().getId();
    String name = Thread.currentThread().getName();
    int priority = Thread.currentThread().getPriority();
    Thread.State s = Thread.currentThread().getState();
    System.out.println("id:"+id+"  name:"+name+"  priority:"+priority+"  State:"+s);
    try {
      Thread.sleep(2000);  // 3초 대기한다.
    } catch (Exception e) { return; }
    System.out.println(this.seq + " thread end.\n");  // 쓰레드 종료 
  }

  public static void main(String[] args) {
    long id = Thread.currentThread().getId();
    String name = Thread.currentThread().getName();
    int priority = Thread.currentThread().getPriority();
    Thread.State s = Thread.currentThread().getState();

    System.out.println("id:"+id+"  name:"+name+"  priority:"+priority+"  State:"+s+"\n");

    for (int i = 0; i < 3; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
      Thread t = new Sample_Thread(i);
      t.start();
      try{ t.join(); }
      catch(Exception e) { return; }
    }

    id = Thread.currentThread().getId();
    name = Thread.currentThread().getName();
    priority = Thread.currentThread().getPriority();
    s = Thread.currentThread().getState();

    System.out.println("id:"+id+"  name:"+name+"  priority:"+priority+"  State:"+s);
    System.out.println("main end.");  // main 메소드 종료
  }
}
