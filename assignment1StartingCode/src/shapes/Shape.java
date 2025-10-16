package shapes;

import shapes.Shape;

public abstract class Shape implements Comparable<Shape> {

    protected double height;

    public Shape(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    
    public abstract double getBaseArea();

    public abstract double getVolume();

    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.height, other.height);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + " [Height=" + String.format("%.2f", getHeight())
                + ", Base Area=" + String.format("%.2f", getBaseArea())
                + ", Volume=" + String.format("%.2f", getVolume()) + "]";
    }
}