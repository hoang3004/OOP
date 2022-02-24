package oo.bank;

import java.util.Scanner;

public class Employee {
    String enName;
    double salary;

    Scanner input = new Scanner(System.in);

    void  getEnName(){
        System.out.print("Nhap ten nhan vien: ");
        enName = input.nextLine();
    }

    void getSalary(){
        System.out.print("Nhap luong nhan vien: ");
        salary = input.nextDouble();
        
    }
    String getEmInfor(){
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ten nhan vien la: "+enName);
        System.out.println("Luong nhan vien la: "+salary + "dong");
        return enName+salary;
    }
}
