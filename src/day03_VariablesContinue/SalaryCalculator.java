package day03_VariablesContinue;

public class SalaryCalculator {

    /*
    Warm up task:
    rate = 55;
    stateTaxRate = 0.04;
    federalTaxRate = 0.22;
    weeklyHours = 40;
     */
    public static void main(String[] args) {
        // DataType varaibleName = Data;

        double hourlyRate = 65;
        double stateTaxRate = 0.0;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte weeksInAYear = 52;
        // salary = hourlyRate * weeklyhours * 52
        double salary = hourlyRate * weeklyHours * weeksInAYear;
        //salary before tax (gross income)
        //stateTax = total salary * stateTax
        double stateTax = salary * stateTaxRate;
        //federalTax = salary + federalTaxRate
        double federalTax = salary * federalTaxRate;

        //totalTax = stateTax + federalTax
        double  totalTax = stateTax + federalTax;
        //salaryAfterTax = salary - stateTax - federalTax
        double salaryAfterTax = salary - ( stateTax + federalTax );

        System.out.println("Your salary is: $" + salary); // + concatenation
        System.out.println("state tax is: $" + stateTax);
        System.out.println("federal tax is: $" + federalTax);
        System.out.println("total tax is: $" + totalTax);
        System.out.println("Salary After Tax is: $" +salaryAfterTax);
        System.out.println("montly salary is: " + salaryAfterTax/12);


        // System.out.println("9" + 3); //thi is again concatenation because both of them are not numbers (on is text)
        // System.out.println(9+3); // this is is addition because they are both numbers


    }






}
