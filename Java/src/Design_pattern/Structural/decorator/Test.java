package Design_pattern.Structural.decorator;

public class Test {
    public static void main(String[] args) {
        Fighter[] fighter = new Fighter[4];
        fighter[0] = new XWingFighter();

        fighter[0].attack();

        System.out.println("----------------");

        fighter[1] = new LaserDecorator(fighter[0]);
        fighter[1].attack();

        System.out.println("----------------");

        fighter[2] = new PlasmaDecorator(fighter[1]);
        fighter[2].attack();

        System.out.println("----------------");

        fighter[3] = new MissileDecorator(fighter[2]);
        fighter[3].attack();

        System.out.println("----------------");

        fighter[2].attack();

    }
}
