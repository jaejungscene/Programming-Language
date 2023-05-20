package Experiments;

public class test03 {

    public static void main(String[] args) {
        Thread th = new Thread(){
            int n=0; 
            @Override
            public void run(){
                while(n<=5){
                    System.out.println(n);
                    n++;
                    try{
                        sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println("exit...");
                        return;
                    }
                }
            }
        };
        th.start();
        th.interrupt();
    }
}