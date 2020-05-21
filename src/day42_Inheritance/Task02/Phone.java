package day42_Inheritance.Task02;
/*
create ba class called phone:
				attributes: brand, model, price, country, Type="Country"
				methods: call, text,  toString
 */
public class Phone extends Device {


    /*
    brand (Inherited)
    model (Inherited)
    price (Inherited)
    country (Inherited)
    type (Inherited)
    size (Inherited)

    setDevice() (Inherited)

    call ()
    text ()
    toString (Inherited)
     */

    public Phone(String brand, String model, double price, String size){

        setDevice(brand, model, price, "Phone",size);
    }

    public void call(long number){
        System.out.println("calling the number: "+number);
    }

    public void text(long number){
        System.out.println("Texting to: "+number);
    }
}
