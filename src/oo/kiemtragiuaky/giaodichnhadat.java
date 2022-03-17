package oo.kiemtragiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class giaodichnhadat {
    private String maGD;
    private Date ngayGD;
    private double donGia;
    private float dientich;
    Scanner nhap = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }
    public Date getNgayGD() {
        return ngayGD;
    }
    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public float getDientich() {
        return dientich;
    }
    public void setDientich(float dientich) {
        this.dientich = dientich;
    }
    public SimpleDateFormat getDate() {
        return date;
    }
    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    public void nhapDS() throws ParseException{
        System.out.println("------------------------------------");
        System.out.print("+ Nhập mã giao dich: ");
        maGD = nhap.nextLine();
        System.out.print("+ Nhập ngày giao dich: ");
        ngayGD = date.parse(nhap.nextLine());
        System.out.print("+ Nhập don gia: ");
        donGia = nhap.nextDouble();
        System.out.print("+ Nhập dien tich: ");
        dientich = nhap.nextFloat();
        nhap.nextLine();
    }

}
