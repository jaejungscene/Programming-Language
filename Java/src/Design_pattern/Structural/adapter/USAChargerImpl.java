package Design_pattern.Structural.adapter;

public class USAChargerImpl implements USACharger {
    private double width;

    public USAChargerImpl(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
