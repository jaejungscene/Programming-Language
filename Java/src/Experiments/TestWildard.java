package Experiments;


import java.util.*;

interface interf{
    public void interfFunc();
}
class A{
    public int x = 123;
    public A() {
        System.out.println("constructor A executed");
    }
    public void printA() {
        System.out.println("printA executed");
    }
}


class B implements interf{
    public int y = 321;

    @Override
    public void interfFunc() {
        System.out.println("interfFunc is executed");
    }
    public B() {
        System.out.println("constructor B executed");
    }

    public void printB() {
        System.out.println("printB executed");
    }
}
public class TestWildard {
    static void printCollection(Collection<? extends Object> c){
        for(Object e: c){
            System.out.println(e);
        }
    }

    static void dynamicParams(String... arr) {
        System.out.println("--- start ---");
        for (Object e : arr) {
            System.out.println(e);
        }
        System.out.println("--- finish ---");
    }

    static <T> T genericFunc(T element) {
        System.out.println(element.getClass().getName());
        return element;
    }

    public static void main(String[] args) {
        String[] arr = {"hello", "jaejung", "welcome"};
        List<String> stringList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(stringList.get(0));
        printCollection(stringList);
        System.out.println(stringList.getClass());
        dynamicParams("hello", "jaejung", "my name is null");
        Object obj = genericFunc(stringList);
        ArrayList<String> ptr = (ArrayList<String>)obj;

        System.out.println("obj : " + obj.getClass());
//        System.out.println("obj : " + obj.get(0));
        System.out.println("ptr : " + ptr.get(0));
//        Arrays.asList(arr);
//        String string = "yaho";
//        Object object = string;
//
//        List<String> stringList = new ArrayList<>();
//        List<> objectList = stringList;


    }

}
