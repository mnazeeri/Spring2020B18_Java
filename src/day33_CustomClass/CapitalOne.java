package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Anna = new BankAccount();
        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456;

        Anna.checkingBalance();
        Anna.deposit(33000);

        Anna.checkingBalance();

        Anna.withDraw(13000);

        Anna.checkingBalance();

        Anna.withDraw(30000);
        Anna.checkingBalance();

        Anna.withDraw(5000);
        Anna.checkingBalance();

        System.out.println("=======================================================");

        System.out.println(Anna);
    }
}
