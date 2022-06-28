package Thread;

public class SynchronizedEx {
  public static void main(String[] args) {
    SharedPrinter p = new SharedPrinter();
    String[] engText = {"qwqwoijtakzvaklsdjf awieer",
      "azxckljvw rotwrjsdlfkasdf",
      "zxkzj cvioawejdjalgd cv",
      "alkdfj ealsd gasdlkgjauiop"};
    String[] korText = {"ㅂㅈㄷㄱ", "ㅁㄴㅇㄹ", "ㅋㅌㅊㅍ", "ㅕㅑㅐㅔ"};

    WorkerThread th1 = new WorkerThread(p, engText);
    WorkerThread th2 = new WorkerThread(p, korText);

    th1.start();
    // try{  th1.join(); } catch(InterruptedException e){};
    th2.start();
    // try{  th2.join(); } catch(InterruptedException e){};
  }
}

class SharedPrinter{
  // synchronized void print(String text){
  void print(String text){
    //Thread.yield();
    // for(int i=0; i<text.length(); i++){
    //   System.out.print(text.charAt(i));
    // }
    // System.out.println();
    realPrint(text);
  }

  synchronized void realPrint(String text){
    for(int i=0; i<text.length(); i++){
      System.out.print(text.charAt(i));
    }
    System.out.println();
  }
}

class WorkerThread extends Thread{
  private SharedPrinter p;
  private String[] text;

  public WorkerThread(SharedPrinter p, String[] text){
    this.p = p; this.text = text;
  }

  @Override
  public void run(){
    for(int i=0; i<text.length; i++)
      p.print(text[i]);
    System.out.println();
  }
}