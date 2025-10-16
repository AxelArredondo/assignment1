package shapes;

public class SquarePrism extends Shape {

    private double edge;

    public SquarePrism(double height, double edge) {
        super(height);
        this.edge = edge;
    }

    @Override
    public double getBaseArea() {
        return edge * edge;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}