// https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java
package Design_pattern.Creational.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer comp = new Computer.builder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(comp.getHDD());
        System.out.println(comp.getRAM());
        System.out.println(comp.isBluetoothEnabled());
        System.out.println(comp.isGraphicsCardEnabled());
    }
}
