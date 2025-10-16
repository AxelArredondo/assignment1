package shapes;

public class Pyramid extends Shape {

    private double edge;

    public Pyramid(double height, double edge) {
        super(height);
        this.edge = edge;
    }

    @Override
    public double getBaseArea() {
        return edge * edge;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * getBaseArea() * getHeight();
    }
}
