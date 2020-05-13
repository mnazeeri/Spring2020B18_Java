package day37_Constructors;

public class Employee {

    /*
    1. Create a class called employee
    instance variables:
    name. ID, SSN, jobTitle, salary, Gender

    actions: SetEmployeeInfor(): that can initialize all the isntance variables
    toString(): that can return the infor of the employee as string
     */

    String name;
    long ID;
    long SSN;
    String jobTitle;
    double salary;
    char gender;

    public  void setInfo(String name, long ID, long SSN, String jobTitle, double salary, char gender){

        this. name = name;
        this. ID = ID;
        this.SSN = SSN;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString() {

        return "Name: "+name+" ID: "+ID+"SSN: "+SSN+" JOb Title: "+jobTitle+" Salary: "+salary+" Gender: "+gender;

    }

}
