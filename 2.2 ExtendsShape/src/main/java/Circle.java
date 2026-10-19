public class Circle extends ShapeCircular {
    public Circle(int r) {
        this.radius = r;
    }

    @Override public String printShape() {
        return "Se imprime un Círculo con radio: " + this.radius + ", area: " + this.getArea() + ", perímetro: " + this.getPerimeter();
    }    
}