package Design_pattern.Structural.decorator;

public abstract class FighterDecorator implements Fighter{
    private Fighter decoratedFighter;

    public FighterDecorator(Fighter decoratedFighter) {
        this.decoratedFighter = decoratedFighter;
    }

    @Override
    public void attack() {
        decoratedFighter.attack();
    }

    @Override
    public Fighter getMe() {
        return this;
    }

//    @Override
//    public Fighter down(){
//        return super.getMe();
//    }
}
