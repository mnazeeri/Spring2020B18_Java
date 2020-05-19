package day41_Inheritance.task01;
/*
create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
 */
public class Developer extends Employee{

    /*
    salary (Inherited)
    name (Inherited)
    id (Inherited)
    jobTile (Inherited)
    gender (Inherited)

    fixingBug
    Coding
     */

    public Developer(double salary, String name, long ID, String Jobtitle, char gender ){

        this. salary = salary;
        this.jobTitle = Jobtitle;
        this.name = name;
        this.ID = ID;
        this.gender = gender;

    }

    public void fixingBug(){
        System.out.printf(name+ " is fixing the bug");
    }

    public void testing(){
        System.out.println(name+ " is testing");
    }

}
