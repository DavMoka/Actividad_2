public class ShapeCircular extends Shape2D {
    protected int radius;

    @Override public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}