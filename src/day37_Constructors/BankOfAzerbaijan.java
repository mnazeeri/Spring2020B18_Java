package day37_Constructors;

import java.util.ArrayList;

public class BankOfAzerbaijan {

    /*
    3. Create a class called BankofAzerbaijan
    in the main method:
    1. create a list of Employees
    2.add random two employees from Human Resources to the list
    3. use for each loop to print out the employee info
     */
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}



