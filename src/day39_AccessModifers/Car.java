package day39_AccessModifers;

/*
1. create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initalize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method
 */
public class Car {

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String brand, String model){

        this(brand);
       // this.brand = brand;
        this.model = model;

    }

    public Car(String brand, String model, int year){
        this(brand, model); // the same as "this.brand = brand; & this.model = model;"
        this.year = year;

    }

    public Car(String brand, String model, int year, double price){
        this(brand, model,year); // the same as "this.brand = brand; & this.model = model; & thisprice = price;"
        this.price = price;

    }
    /*
    public void method1(){

        this.("Toyotal");

    }

     */

    public String toString(){
        return year+" "+brand+" "+model+" "+" $"+price;
    }

}
