package oo.baitapxoayhinh2;

public class Square {
    String soundFile = "square_aif";

    public Square(String sound){
        this.soundFile = sound;
    }
    void rotate(){
        System.out.println("Xoay 360 độ");
    }

    void playSound(){
        System.out.println("Play sound: "+ this.soundFile );
    }
}
