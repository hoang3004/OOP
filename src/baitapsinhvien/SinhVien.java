package baitapsinhvien;

import java.util.Scanner;

public class SinhVien {
    int mssv;
    String name;
    String lop;
    Scanner input = new Scanner(System.in);

    void nhapSinhVien(){
        System.out.println("hay nhap ten sinh vien: ");
        name = input.nextLine();
        System.out.println("hay nhap ma so sinh vien: ");
        mssv = input.nextInt();
        System.out.println("hay nhap lop sinh vien: ");
        lop = input.next();
       
    }
    void show(){
        System.out.println("------Thong tin nhan vien: ------");
        System.out.println("Ten cua sinh vien la: "+ name);
        System.out.println("ma so sinh vien la: "+mssv );
        System.out.println("lop cua sinh vien la: "+ lop  );
    }
    
}
