package Design_pattern.Structural.decorator;

public class PlasmaDecorator extends FighterDecorator{
    public PlasmaDecorator(Fighter decoratedFighter){
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        System.out.println("플라즈마 발사");
        super.attack();
    }

    public Fighter getMe(){
        return this;
    }


    public Fighter down(){
        return super.getMe();
    }
}
