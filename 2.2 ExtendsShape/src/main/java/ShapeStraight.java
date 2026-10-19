public class ShapeStraight extends Shape2D {
    protected int width;
    protected int height;
    
    @Override public double getPerimeter() {
        return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    
    @Override public double getArea() {
        return width * height / 2;
    }
}