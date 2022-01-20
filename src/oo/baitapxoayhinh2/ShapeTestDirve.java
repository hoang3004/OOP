package oo.baitapxoayhinh2;

public class ShapeTestDirve {
    public static void main(String[] args) {
        System.out.println("Hình Tam Giác");
        Triangle triangle = new Triangle("mùa xuân");
        triangle.rotate();
        triangle.playSound();

        System.out.println("Hình Vuông");
        Square square = new Square("mùa hè");
        square.rotate();
        square.playSound();

        System.out.println("Hình Tròn");
        Circle circle = new Circle("Mùa đông");
        circle.rotate();
        circle.playSound();
    }
}
