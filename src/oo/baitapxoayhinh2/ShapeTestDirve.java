package oo.baitapxoayhinh2;

public class ShapeTestDirve {
    public static void main(String[] args) {
        System.out.println("Hình Tam Giác");
        Triangle triangle = new Triangle("ting ting ting");
        triangle.rotate();
        triangle.playSound();

        System.out.println("Hình Vuông");
        Square square = new Square("ten ten ten");
        square.rotate();
        square.playSound();

        System.out.println("Hình Tròn");
        Circle circle = new Circle("tang tang tang");
        circle.rotate();
        circle.playSound();
    }
}
