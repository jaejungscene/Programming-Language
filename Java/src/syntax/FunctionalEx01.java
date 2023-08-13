package syntax;

import java.util.function.Consumer;


public class FunctionalEx01 {
    interface MyFunctional01<T>{
        void accept(T t);
    }

    interface MyFunctional02<T, E>{
        E get(T t);
    }

    public static void main(String[] args) {
        MyFunctional01<Integer> method = (n) -> {System.out.println(n);};
        System.out.println(method);
        method.accept(12);

        Consumer<Integer> method01 = (n) -> {int k = n+1; System.out.println(k+", "+n);};
        method01.accept(3);

        method01 = method01.andThen((k)->{System.out.println(k);});
        method01.accept(234);

        System.out.println("---------------------");

        MyFunctional02<Integer, Double> method02 = (n) -> Double.valueOf(n);
        System.out.println(method02.get(12));
    }
}
