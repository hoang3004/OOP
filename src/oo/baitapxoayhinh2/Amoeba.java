package oo.baitapxoayhinh2;

public class Amoeba {
    String soundFile = "amoeba.hif";
    double xpoint;
    double ypoint;

    public Amoeba(String soundFile , double xpoint, double ypoint){
        this.soundFile = soundFile;
        this.xpoint = xpoint;
        this.ypoint = ypoint; 
    }

    void rotate(){
        System.out.println("xoay 360 do at xpoint: "+ xpoint + "ypoint:" + ypoint );

    }
    void playSound(){
        System.out.println("Play sound: "+ this.soundFile + " music");
    }
}
