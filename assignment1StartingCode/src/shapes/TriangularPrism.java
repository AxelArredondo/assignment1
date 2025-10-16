package shapes;

import shapes.Shape;

public class TriangularPrism extends Shape {

    private double edge;

    public TriangularPrism(double height, double edge) {
        super(height);
        this.edge = edge;
    }

    @Override
    public double getBaseArea() {
        return (Math.pow(edge, 2) * Math.sqrt(3)) / 4.0;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}