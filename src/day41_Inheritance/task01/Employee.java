package day41_Inheritance.task01;
/*
    Create a class called Employee:
    Variables: salary, name, id, JobTitle, gender
    Actions: toString
     */
public class Employee{
    public double salary;
    public String name;
    public  long ID;
    public String jobTitle;
    public char gender;

    public String toString(){

        return "Name: "+name+" Job Title: "+jobTitle+" Salary: $"+salary+" Gender: "+gender;
    }



}
