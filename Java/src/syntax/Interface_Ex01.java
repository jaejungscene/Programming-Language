package syntax;


interface interfaceA{
    default void defaultMethod(){
        System.out.println("defaultMethod");
    }
    public static void method2(){
        System.out.println("method2");
    }
}
public class Interface_Ex01 {
    public static void main(String[] args) {
        interfaceA.method2();
        interfaceA a = new interfaceA() {};
        a.defaultMethod();
    }
}
