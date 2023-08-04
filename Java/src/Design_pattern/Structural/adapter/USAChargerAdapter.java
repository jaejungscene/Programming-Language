package Design_pattern.Structural.adapter;

public class USAChargerAdapter implements KoreanChargeHole{
    private USACharger usaCharger;

    public USAChargerAdapter(USACharger usaCharger) {
        this.usaCharger = usaCharger;
    }

    @Override
    public double getRadius() {
        return usaCharger.getWidth() * Math.sqrt(2) / 2;
    }
}
