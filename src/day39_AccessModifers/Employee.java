package day39_AccessModifers;
/*

create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */

public class Employee {

    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;
    static String companyName = "BOA";


    public Employee(String name) {
        this.name = name;

    }

    public Employee(String name, String jobTitle){
        this(name); // same as this.name = name;
        this.jobTitle = jobTitle;
    }

    public String toString(){
        return "Name: "+name+" id: "+id+" jobTitle: "+jobTitle+", Company Name: "+companyName+", salary: "+salary+" gender: "+gender;
    }


}