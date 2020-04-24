package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
        /*
        Salary, Federal Tax, State tax rate, Loan, ssn
         */
    int salary = 120000;
        double FederalTax = 0.18;
        float StateTax = 0.065f;
        //salary after tax=salary(1-sum of taxes)
        double sumTaxes = FederalTax + StateTax;
        double SalaryAfterTax = salary * (1-sumTaxes);
         System.out.println(SalaryAfterTax);

        System.out.println("==========================================================================");

        //are of the circle = r*r* 3.14
        double r = 5.5;
        double area = r * r* 3.14;
        System.out.println( area);

        System.out.println("=========================================================================");

        int kg = 90;
        double pound = kg * 2.25;
        System.out.println(pound);

        double lira = 1000;
        double liraInDollar = lira / 6.15;
        System.out.println(liraInDollar);

        double AFN = 1700;
        double AFNInDollar = AFN / 76;
        System.out.println(AFNInDollar);

        System.out.println("===========================================================================");
        double liter = 10000;
        double literIngalon = liter / 3.7;
        System.out.println(literIngalon);


    }







}
