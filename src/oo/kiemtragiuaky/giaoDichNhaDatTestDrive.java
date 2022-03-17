package oo.kiemtragiuaky;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class giaoDichNhaDatTestDrive {
    
  public static void main(String[] args) throws ParseException{  
      
    {
        List <giaodichnha> dsLoaiNha = new ArrayList<>();
        List <giaodichdat> dsLoaiDat  = new ArrayList<>();
        int luachon;
        double thanhTien;
        Scanner nhap = new Scanner(System.in);
        do{
            System.out.println("======================MENU======================");
            System.out.println(">>1. Nhập danh sách giao dich dat.");
            System.out.println(">>2. Nhập danh sách giao dich nha.");
            System.out.println(">>3. Xuất danh sách giao dich dat.");
            System.out.println(">>4: Xuất danh sách giao dich nha.");
            System.out.println(">>5. Tổng số lượng giao dich.");
            System.out.println(">>6: xuat danh sach giao dich cua tháng 9/2013.");
            System.out.println(">>7: trung binh thanh tien cua giao dich dat");
            System.out.println(">>8: Kết thúc.");
            System.out.print("- Nhập vào sự lựa chọn(1->8): ");
            luachon = nhap.nextInt();
            switch(luachon){
                case 1: 
                    System.out.println("----Nhập danh sách giao dich dat----");
                    System.out.print("- so luong giao dich dat muon nhap: ");
                    luachon = nhap.nextInt();
                    nhap.nextLine();
                    for(int i = 0;i < luachon;i++){
                        giaodichdat gdd = new giaodichdat();
                        gdd.nhapDS();
                        dsLoaiDat.add(gdd);
                    }
                    break;
                case 2: 
                    System.out.println("----Nhập danh sách giao dich nha----");
                    System.out.print("- so luong giao dich nha muon nhap la: ");
                    luachon = nhap.nextInt();
                    nhap.nextLine();
                    for(int i = 0;i < luachon;i++){
                        giaodichnha gdn = new giaodichnha();
                        gdn.nhapDS();
                        dsLoaiNha.add(gdn);
                    }
                    break;
                case 3:
                    System.out.println("----Xuất danh sách giao dich dat----");
                    for (giaodichdat x : dsLoaiDat) {
                        System.out.println("_________________________________________");
                            System.out.println("Nhap loai dat: ");
                            System.out.println("1.Loai A");
                            System.out.println("2.Loai B");
                            System.out.println("3.Loai C");
                            System.out.print("Lua chon: ");
                            int giaodichdat = nhap.nextInt();
                    
                            switch (giaodichdat) {
                                case 1:
                                    giaodichdat.loaiDat = "Loai A";
                                    break;
                                case 2:
                                    giaodichdat.loaiDat = "Loai B";
                                    break;
                                case 3:
                                    giaodichdat.loaiDat = "Loai C";
                                    break;
                                default:
                                    break;
                            }
                        }
                        
                        void tinhThanhTien() {
                            if(giaodichdat == 1){
                                this.thanhTien = this.dienTich*this.donGia*1.5;
                            }else{
                                this.thanhTien = this.dienTich*this.donGia;
                            }
                        }
                    }
                    break;
                case 4: 
                    System.out.println("----Xuất danh sách giao dich nha----");
                    for (giaodichnha x : dsLoaiNha) {
                        System.out.println("_________________________________________");
                        System.out.println(x);
                        
                    }
            
                    break;
                case 5: 
                    System.out.println("----Tổng số lượng giao dich----");
                    int tong = 0;
                    for (giaodichdat x : dsLoaiDat) {
                        tong++;
                    }
                    System.out.println("- Số luong giao dich dat là: "+tong);
                    tong = 0;
                    for (giaodichnhadat x : dsLoaiNha) {
                        tong++;
                    }
                    System.out.println("- Số luong giao dich nha là: "+tong);
                    break;
                case 6: 
                    System.out.println("----Tính trung bình thành tiền của hóa đơn thuê\n phòng trong tháng 9/2013----");
                    break;
                case 7:
                System.out.println("----Tính trung bình thành tiền của giao dich dat----");
                break;
                case 8:
                    System.out.println("- KẾT THÚC!");
                    return; 
                    default: 

                    System.out.println("- Lựa chọn không hợp lệ!");       
            }
            System.out.print("- Quay lại MENU(1:yes/0:no): ");
            luachon = nhap.nextInt();
        }while(luachon == 1);
    }
}
}
