package day41_Inheritance.Task02;
/*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */

public class CheckingAccount extends BankAccount{
    /*
    accountNumber (Inherited)
    accountHolder (Inherited)
    balance (Inherited)

    deposit (Inherited)
    withdraw
    showBalance (Inherited)
    toString (Inherited)

     */

    public void  withDraw(int amount){
        balance -= amount;
    }
}
