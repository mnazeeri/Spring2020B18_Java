package day41_Inheritance.task01;
/*
create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester
 */
public class Tester extends Employee{

    /*
    name (Inherited)
    salary (Inherited)
    id (Inherited)
    jobTitle (Inherited)
    gender (Inherited)

    Reporting()
    Testing ()

    toString (Inherited)
     */

    public Tester(String name,double salary, long ID, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void reporting(){
        System.out.println(name+" is reporting bugs");
    }

    public void testing(){
        System.out.println(name+" is testing");
    }
}
