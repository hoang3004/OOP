package oo.baitapxoayhinh;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        circle.rotatet();
        circle.play();

        square.rotate();
        square.play();

        triangle.rotate();
        triangle.play();
    }
}
