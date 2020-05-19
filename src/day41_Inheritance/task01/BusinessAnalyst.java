package day41_Inheritance.task01;
/*
create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writing Requirements, gathering, toString
     		create a constructor that can initialize all the attributes of businessAnalyst
 */

public class BusinessAnalyst extends Employee {

    /*
    Salary (Inherited)
    name (Inherited)
    ID (Inherited)
    job Title (Inherited)
    Gender (Inherited)

    Writing Req()
    Gathering ()
    toString () (Inherited)
     */

    public BusinessAnalyst(String name,double salary, long ID, char gender){

        this.name=name;
        this.salary=salary;
        this.ID=ID;
        this.jobTitle="Business Analyst";
        this.gender=gender;
}

    public void writingReq(){

        System.out.println(name+" is writing requirements");
    }

    public void gathering(){

        System.out.println(name+" is gathering requirements");
    }



}


