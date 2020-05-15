package OfficeHoursPractice.Practice_05_13_2020;

public class Student {
    /*
    Student:
    ins variables: name, ID,
    ins method: tString
     */

    //static String name; // prints the same name as it has only one copy
    String name; // this means each of the students have their own copy and it prints separate name.
    long ID;
    static String schoolName = "Cybertek"; // this is the common variable for all the students so this can be assigned as static

    public String toString(){
        return "Name: "+name+", ID: "+ID+", School Name: "+schoolName;

    }

    public static void printSchoolName(){
        System.out.println(schoolName+" School");
    }
}

class studentObjects{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Madina";
        student1.ID = 123;


        Student student2 = new Student();
        student2.name = "Emrah";
        student2.ID = 456;

        student1.schoolName = "Harvard";
        student2.name = "Namik";

        System.out.println(student1);
        System.out.println(student2);
    }
}
