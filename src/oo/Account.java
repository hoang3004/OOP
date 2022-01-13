package oo;

import java.util.Scanner;

public class Account {
    int account_number = 123456;
    int account_balance = 0;
    Scanner input = new Scanner(System.in);

   void withdraw(){
        System.out.println("nhap vao so tien can rut: ");
        int withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;

    }
    void deposit(){
        System.out.println("nhap vao so tien can gui: ");
        int withdrawAmount = input.nextInt();
        account_balance += withdrawAmount;
    }

    void show(){
        System.out.println("Thong tin tai khoan ");
        System.out.println("Account number:  " + account_number);
        System.out.println("Account balance:  "+ account_balance);
    }
}
