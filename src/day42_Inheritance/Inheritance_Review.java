package day42_Inheritance;

class B{

    public B(int a){

        System.out.println("int");
    }

    public B(double a){
        System.out.println("double");
    }

    public B(long a){
        System.out.println("long");
    }
}

public class Inheritance_Review  extends B{

    public Inheritance_Review(String a){

        super(19l); //int  long
        System.out.println("String"); // string
    }


    public static void main(String[] args) {

        Inheritance_Review obj = new Inheritance_Review("Hello");

    }



}