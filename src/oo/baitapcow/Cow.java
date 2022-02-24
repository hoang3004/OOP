package oo.baitapcow;

public class Cow {
    String gioitinh;
    String giong;
    int cannang;
    String color;


    public void Cow(String gioitinh, String giong, int cannang, String color){
        this.gioitinh = gioitinh;
        this.giong = giong;
        this.cannang = cannang;
        this.color = color;
    }

    public void inThongtinCow(){
        System.out.println("Thông tin:");
        System.out.println("Giới tính: "+gioitinh);
        System.out.println("Giống: "+giong);
        System.out.println("Cân nặng: "+cannang);
        System.out.println("Màu sắc: "+color);
    }

    public void an(){
        System.out.println("Dang an: nhoam nhoam");
    }

    public void keu(){
        System.out.println("Dang kêu: BOOOOO");
    }
}
