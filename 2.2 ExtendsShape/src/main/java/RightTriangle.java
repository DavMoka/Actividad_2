public class RightTriangle extends ShapeStraight {
    public RightTriangle(int h, int w) {
        this.height = h;
        this.width = w;
    }

    @Override public String printShape() {
        return "Se imprime un Triángulo con alto: " + this.height + ", ancho: " + this.width + ", area: " + this.getArea() + ", perímetro: " + this.getPerimeter();
    }    
}