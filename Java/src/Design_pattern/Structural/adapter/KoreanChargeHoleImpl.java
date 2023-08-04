package Design_pattern.Structural.adapter;

public class KoreanChargeHoleImpl implements KoreanChargeHole{
    private double radius;

    public KoreanChargeHoleImpl(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

    public boolean fit(KoreanChargeHole koreanChargeHole) {
        return this.getRadius() >= koreanChargeHole.getRadius();
    }
}
