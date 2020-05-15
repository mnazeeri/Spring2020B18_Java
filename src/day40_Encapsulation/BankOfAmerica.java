package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        EmployeeInfo Murtaza = new EmployeeInfo();

        Murtaza.setAddress("Dallas TX");
        Murtaza.setSalary(124500);
        System.out.println(Murtaza.getAddress());
        System.out.println(Murtaza.companyName);
        System.out.println(Murtaza.getSalary());


    }
}
