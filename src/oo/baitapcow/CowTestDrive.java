package oo.baitapcow;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.Cow("Cai", "cobe", 19, "vang");
        cow.inThongtinCow();
        cow.an();
        cow.keu();
        System.out.println("------------------");
        
        Cow cow2 = new Cow();
        cow2.Cow("Duc", "Uc", 80, "den");
        cow2.inThongtinCow();
        cow2.an();
        cow2.keu();
    }
}
