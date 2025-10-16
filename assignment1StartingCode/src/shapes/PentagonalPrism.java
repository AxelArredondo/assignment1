package shapes;

import shapes.Shape;

public class PentagonalPrism extends Shape {

    private double edge;

    public PentagonalPrism(double height, double edge) {
        super(height);
        this.edge = edge;
    }

    @Override
    public double getBaseArea() {
        return (5.0 * edge * edge * Math.tan(Math.toRadians(54.0))) / 4.0;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}