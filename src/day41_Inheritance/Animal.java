package day41_Inheritance;

public class Animal {

    /*
    name
    body
    size
    weight

     */

    public String name;
    public String size;
    public double weight;

    //Actions:

    public void eat(){

        System.out.println(name+" is eating");
    }

    public void move(){

        System.out.println(name+" is moving");
    }
}
