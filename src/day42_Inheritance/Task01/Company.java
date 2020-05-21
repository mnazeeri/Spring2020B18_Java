package day42_Inheritance.Task01;

/*
Create a class called company:
        create 3 object of employee and set their info
        create an array of employees and store all those employee objects
        use regular for lop to print out each employee's name and employeeID


 */
public class Company {

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {

        employee1 = new Employee( );
        employee1.setEmployeeInfo("Murtaza", 30, 'M', 125000, 12345, "SDET");

        employee2 = new Employee();
        employee2.setEmployeeInfo("Messi", 33, 'M', 952000, 12300, "Soccer Player");

        employee3 = new Employee();
        employee3.setEmployeeInfo("Mushtari", 23, 'F', 52300, 9876, "Doctor");

    }

    public static void main(String[] args) {

        Employee [] employees = {employee1, employee2, employee3};

        for ( int i = 0; i<employees.length; i++ ){
          //System.out.println(employees[i]);
            System.out.println("Name: "+employees[i].name+" Employee ID: "+employees[i].employeeID);
        }
        }

}
