package day42_Inheritance.Task02;
/*
create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString

 */
public class TV extends Device {
/*
brand (Inherited)
model (Inherited)
price (Inherited)
country (Inherited)
type (Inherited)
size (Inherited)

watch,
toString

 */

    public TV(String brand, String model, double price, String size){
        setDevice(brand,model, price, "TV", size );
    }

    public void watch(){
        System.out.println("I am watching "+brand+" "+model+" "+type+" that cost me $"+price+" from "+country );
    }



}
