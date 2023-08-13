package Design_pattern.Creational.factory_method;

public class Console {

    private ComponentFactory componentFactory = new ComponentFactory();

    Component comp1;
    Component comp2;
    Component comp3;

    void withoutFactory () {
        comp1 = new Button();
        comp2 = new Switch();
        comp3 = new Dropdown();
    }

    void withFactory () {
        comp1 = componentFactory.getComp(Usage.PRESS);
        comp2 = componentFactory.getComp(Usage.TOGGLE);
        comp3 = componentFactory.getComp(Usage.EXPAND);
    }
}

enum Usage {
    PRESS, TOGGLE, EXPAND
}
