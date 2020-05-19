package day41_Inheritance.task01;

public class EmployeeObjects {
    public static void main(String[] args) {

        Developer dev1 = new Developer(120000, "Murtaza", 12345, "Software Engineer", 'M');

        //dev1.reporting();

        System.out.println(dev1);
        dev1.fixingBug();

        System.out.println();
        System.out.println("==========================================================================");

        Tester tester1 = new Tester("Hilal", 115000, 4321, "QA", 'F');

        //tester1.coding(); //error because this does not exist in tester class.

        tester1.reporting();
        System.out.println(tester1);

        System.out.println("==========================================================================");

        BusinessAnalyst BA1 = new BusinessAnalyst("Ozgur", 125000, 7890, 'M');

       // BA1.coding() // this does not have this action in the object class

        BA1.writingReq();
        System.out.println(BA1);


    }
}
