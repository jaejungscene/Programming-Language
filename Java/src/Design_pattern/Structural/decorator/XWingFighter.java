package Design_pattern.Structural.decorator;

public class XWingFighter implements Fighter{
    @Override
    public void attack() {
        System.out.println("탄환 발사");
    }

    @Override
    public Fighter getMe() {
        return this;
    }

    @Override
    public Fighter down() {
        return this;
    }
}
