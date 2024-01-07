package syntax;

class OuterStaticClass{
    static class StaticClass{
        public void helloWorld() {
            System.out.println("Hello world");
        }
    }

    class NormalClass{
        public void helloWorld() {
            System.out.println("NormalClass");
        }
    }
}

public class StaticClassEx01 {
    public static void main(String[] args) {
        OuterStaticClass.StaticClass c = new OuterStaticClass.StaticClass();
        c.helloWorld();
        OuterStaticClass.NormalClass c1 = (new OuterStaticClass()).new NormalClass();
        c1.helloWorld();
    }
}
