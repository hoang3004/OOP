package oo.kiemtragiuaky;

import java.text.ParseException;
import java.util.Scanner;

public class giaodichdat {
    Scanner nhap = new Scanner(System.in);
    private int loaiDat;
    public int getLoaiDat() {
        return loaiDat;
    }
    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }
    

    
    public void nhapDS() throws ParseException {
        System.out.print("+ Nhập loai dat: ");
        loaiDat = nhap.nextInt();
    }
    @Override
    public String toString() {
        return super.toString() + "\n+ loai dat: "+loaiDat;
    }
}
