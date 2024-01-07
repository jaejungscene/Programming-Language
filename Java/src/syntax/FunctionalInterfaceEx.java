package syntax;

import java.util.StringTokenizer;

@FunctionalInterface
interface ForLambdaEx{
    int addInteger(int a, int b);

    //    double addDouble(double a, double b);
    default void defaultPrint() {
        System.out.println("defaultPrint");
    }
    static void print(){
        System.out.println("hello world");
    };
}

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        ForLambdaEx ex = (x, y) -> x+y;
        System.out.println(ex.addInteger(1,2));
        int[] arr = {12,2};
    }
}
