package day35_Static;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class staticPractic2 {

    String Brand;
    String Model;
    static boolean hasWheels = true;

    public void printBran(){

        System.out.println(Brand);
    }

public void printModel(){
    System.out.println(Model);

}

    public static void main(String[] args) {

        System.out.println(hasWheels);
    }

}
