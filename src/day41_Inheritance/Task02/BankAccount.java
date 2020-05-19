package day41_Inheritance.Task02;
/*
    Create a class called BankAccount
        Variables: accountNumber, accountHolder, Balance
        Methods: deposit, showBalance, toString
 */
public class BankAccount {

    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void Deposit(int amount){
        balance += amount;

    }

    public void showBalance(){
        System.out.println("Available Balance: $"+balance);

    }

    public String toString(){

        return "Name: "+accountHolder+" Balance: $"+balance;
    }
}
