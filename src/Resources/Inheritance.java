package Resources;


import day42_Inheritance.Data;

public class Inheritance extends Data {
    //         sub                super

    public static void main(String[] args) {

        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
      //System.out.println(Inheritance.defaultData); // default is not visible outside the packag
     // System.out.println(Inheritance.privateData); //private cannot be visible outside the class
    }



}
