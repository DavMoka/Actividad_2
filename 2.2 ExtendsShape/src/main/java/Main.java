public class Main {
    public static void main(String[] args) {
        Shape2D s = new RightTriangle(3, 4);
        System.out.println(s.printShape());
        s = new Circle(3);
        System.out.println(s.printShape());
    }
}