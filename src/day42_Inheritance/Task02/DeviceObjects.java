package day42_Inheritance.Task02;

public class DeviceObjects {

    public static void main(String[] args) {


        TV tv1 = new TV("Samsung", "E250", 500, "40 inch");

        tv1.country = "USA";
        System.out.println(tv1);

        Phone phone1 = new Phone("iPhone", "11Pro", 1000, "Plus");

        System.out.println(phone1);


    }
}
