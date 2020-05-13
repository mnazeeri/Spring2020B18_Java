package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {

        SalaryCalculator Murtaza = new SalaryCalculator(55,40,8.25/100,0.22);
        System.out.println(Murtaza.salary());
        System.out.println(Murtaza);

        System.out.println("===============================================");

        SalaryCalculator Namik = new SalaryCalculator(62,40,8.75/100,0.26);
        System.out.println(Namik.salary());
        System.out.println(Namik);

    }
}
