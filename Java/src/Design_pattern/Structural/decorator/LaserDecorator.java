package Design_pattern.Structural.decorator;

public class LaserDecorator extends FighterDecorator{
    public LaserDecorator(Fighter decoratedFighter){
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("레이저 발사");
    }


    public Fighter getMe(){
        return this;
    }

    public Fighter down(){
        return super.getMe();
    }
}
