package day35_Static;

public class Offer {

    /*
    Create a class called offer that has:
    instance fields:
    Location, company, salary, isFulltime

    Instnace methods:
    setofferInfor: can set the location, company, salary, isFulltime of the offer toString -- print all info about offers
     */

    String location;
    String company;
    double salary;
    boolean isFulltime;

    public void setInfo (String location, String company, double salary, boolean isFulltime){

        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFulltime = isFulltime;


    }

    public String toString(){

        return "Location: "+location+", Company: "+company+",Salary: $"+salary+", Fulltime: "+isFulltime;
    }

}
