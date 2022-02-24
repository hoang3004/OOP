package oo.bank;

import java.util.Scanner;

public class Customer {
     
    Scanner input = new Scanner(System.in);
    String cusName;

    Customer(String name){
        cusName = name;
    }

    void show(){
        System.out.println("Thong tin khach hang");
        System.out.println("Ten khach hang: " + cusName);
        
    }
}
