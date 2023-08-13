package Design_pattern.Structural.decorator;

public class MissileDecorator extends FighterDecorator{
    public MissileDecorator(Fighter decoratedFighter){
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("미사일 발사");
    }

    public Fighter getMe(){
        return this;
    }

    public Fighter down(){
        return super.getMe();
    }
}
