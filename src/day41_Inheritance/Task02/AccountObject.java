package day41_Inheritance.Task02;

public class AccountObject {
    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();

        obj.accountHolder = "Saban";


        obj.showBalance();
        System.out.println(obj);

        obj.Deposit(25000);
        obj.showBalance();

        obj.withDraw(10000);
        obj.showBalance();

        System.out.println(obj);

        System.out.println("=============================================================");

        SavingAccount saving = new SavingAccount();
        saving.accountHolder = "Murtaza";

        System.out.println(SavingAccount.interestRate);

        System.out.println(saving);

        saving.Deposit(3000);
        saving.showBalance();



    }
}
