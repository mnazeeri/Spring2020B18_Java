package day41_Inheritance;

public class JP_Morgan {

    public static void main(String[] args) {

        BankAccount murtaza = new BankAccount("Murtaza", "Nazeeri");
        //System.out.println(MTZ.accountHolder);
        System.out.println(murtaza.getAccountHolder());

        System.out.println(murtaza.getBalance());

        murtaza.checkBalance();
        murtaza.depositing(120);
        murtaza.checkBalance();

        murtaza.withdrawing(80);
        murtaza.checkBalance();

        System.out.println(murtaza);

        murtaza.withdrawing(100);
        murtaza.checkBalance();
        murtaza.depositing(500);
        murtaza.checkBalance();
    }
}
