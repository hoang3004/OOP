package oo.baitapxoayhinh2;

public class Triangle {
    String soundFile = "triangle.aif";

    public Triangle(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Xoay 360 độ");
    }

    void playSound(){
        System.out.println("Play sound: "+ this.soundFile );
    }
}
