package day35_Static;

public class Student {

    /*
    create a custom class called student.
    Attributes:
    name, ID, GPA
    SchoolName == "Cybertek"

    Actions:
    setInfo(): Name, ID, GPA
    printSchoolName():
    toString():
     */

    String name;
    int ID;
    double GPA;

    static String school = "Cybertek";

    public void setInfo(String name, int ID, double GPA){ //if we use any instance, we should not use static

        this.name = name;
        this.ID = ID;
        this.GPA = GPA;


    }

    public static void  printSchoolName(){
        System.out.println("School name is: "+school);
    }

    public String toString(){
        return "Name: "+name+", School Name: "+school;
    }
}
