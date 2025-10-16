package shapes;

public class OctagonalPrism extends Shape {

    private double edge;

    public OctagonalPrism(double height, double edge) {
        super(height);
        this.edge = edge;
    }

    @Override
    public double getBaseArea() {
        return 2.0 * (1.0 + Math.sqrt(2.0)) * edge * edge;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}