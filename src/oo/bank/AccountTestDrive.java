package oo.bank;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account  account;
        account = new Account();

        account.show();
        account.deposit();
        account.show();
        account.withdraw();
        account.show();

        
    }
    
}
