package day37_Constructors;

/*
2. Create a calss called HumanResources
declare 5 variables of Employee as static
use static block to:

1. initialize those static variables
2. set all the info of the Employees
 */



public class HumanResources {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();
/*
    public static void main(String[] args) {

        employee1.setInfo("Murtaza",123456, 12345, "QA", 125000, 'M' );
        employee2.setInfo("Mike",123456, 65432, "QA", 135000, 'M');
        employee3.setInfo("Tom",12312356, 659732, "QA", 115000, 'M');
        employee4.setInfo("Lisa",5431, 123325, "QA", 105000, 'F');
        employee5.setInfo("Ashley",1230056, 600032, "QA", 105000, 'F');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);


    }

 */

    static {
        employee1.setInfo("Murtaza",123456, 12345, "QA", 125000, 'M' );
        employee2.setInfo("Mike",123456, 65432, "QA", 135000, 'M');
        employee3.setInfo("Tom",12312356, 659732, "QA", 115000, 'M');
        employee4.setInfo("Lisa",5431, 123325, "QA", 105000, 'F');
        employee5.setInfo("Ashley",1230056, 600032, "QA", 105000, 'F');


    }
}
