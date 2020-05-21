package day42_Inheritance.Task01;

/*
Create a class called student
        attributes: name, age, gender, StudentID, class
        methods: attendance, code, setStudentInfo, toString
 */
public class Student extends Person {

    /*
    name (Inherited)
    age (Inherited)
    gender (Inherited)
    StudentID
    class
    School name = "Cybertek University"

    setPersonInfo() (Inherited)
    eat () (Inherited)
    sleep () (Inherited)
    walk() (Inherited)
    drink() (Inherited)

    attendClass
    code
    setStudentInfo
    toString
     */

    public long studentID;
    public String clazz;
    public static String schoolName = "Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz ){
        setPersonInfo(name, age, gender);
        this.studentID = studentID;
        this.clazz = clazz;
    }


    public void attendClass(){
        System.out.println(name +" is attending "+clazz);
    }

    public void code(){
        System.out.println(name +" is coding");
    }

    public String toString(){
        return "Name: "+name+", ID: "+studentID+",  Age: "+age
                +", Aender: "+gender+", Class: "+clazz+", School: "+schoolName;
    }





}


