package structured;

import java.util.Scanner;

public class BankStructured {
    static int account_number = 123456;
    static int account_balance = 0;
    static Scanner input = new Scanner(System.in);

    static String emName;
    static double salary;
    
    static String cusname;
    static double address;

    public static void main(String[] args) {
        show();
        deposit();
        withdraw();
    }

    static void withdraw(){
        System.out.println("nhap vao so tien can rut: ");
        int withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;

    }
    static void deposit(){
        System.out.println("nhap vao so tien can gui: ");
        int withdrawAmount = input.nextInt();
        account_balance += withdrawAmount;
    }

    static void show(){
        System.out.println("Thong tin tai khoan ");
        System.out.println("Account number:  " + account_number);
        System.out.println("Account balance:  "+ account_balance);
    }
   
    
    

}
