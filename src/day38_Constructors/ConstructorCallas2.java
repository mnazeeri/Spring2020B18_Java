package day38_Constructors;

public class ConstructorCallas2 {

    public ConstructorCallas2() {
        System.out.println("Default constructor");
    }

    public ConstructorCallas2(int a) {
        this(); // "Default constructor"
        System.out.println("Constructor with int argument");
    }

    public ConstructorCallas2(String str) {
        //   System.out.println(" Hello");
        this(10); // default , & int arguments
        //  this();
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCallas2 obj = new ConstructorCallas2("Hello");



    }


    public void method1() {
        // ConstructorCalls2();
    }

    {

    }


}


