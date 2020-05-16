package day39_AccessModifers;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Murtaza");
        System.out.println(employee1);

        Employee employee2 = new Employee("Messi", "Soccer Player");
        System.out.println(employee2);

        Employee employee3 = new Employee("Martin", "Truck Driver", 123, 125000);
        System.out.println(employee3);

        Employee employee4 = new Employee("John", "Security Guard", 1234, 120000);
        System.out.println(employee4);

        Employee employee5 = new Employee("Fnu", "Uber Driver", 321, 135000, 'M');
        System.out.println(employee5);
    }
}
