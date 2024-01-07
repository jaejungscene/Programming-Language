package syntax;

public class StaticBlockEx {
    static int j = 10;
    static int n;
    static {
        System.out.println("hello world");
        n = j*8;
        System.loadLibrary("native-lib");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(StaticBlockEx.n);
        System.out.println(StaticBlockEx.j);
    }
}
