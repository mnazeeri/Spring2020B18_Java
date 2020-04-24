package day09_NesterdIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {

        double salary = 120000;
        byte workHistory = 3;

        if(salary >= 30000){

            if (workHistory >= 2){
                System.out.println("You are qualified for loan.");
            }else {
                System.out.println("you must have been on job at least 2 years.");
            }

        }else{
            System.out.println("you must earn at least $30,000.");
        }



    }
}
