package Design_pattern.Creational.factory_method;

public class Main {
    public static void main(String[] args) {
        System.out.println("-- withoutFactory() --");
        new Console().withoutFactory();

        System.out.println();

        System.out.println("-- withFactory() --");
        new Console().withFactory();
    }
}