package oo;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account  account;
        account = new Account();

        account.show();
        account.deposit();
        account.show();
        account.withdraw();
        account.show();

        Employee employee = new Employee("Nguyen van A");
        employee = new Employee("Nguyen van B");
        employee.show();

        Customer customer = new Customer("Nguyen Van C");
        customer = new Customer("Nguyen Van D");
        customer.show();
    }
    
}
