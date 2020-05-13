package day38_Constructors;

public class ConstructorCallas {

    public ConstructorCallas(){
        method1();
        method2();
    }

    public ConstructorCallas(int a){
        //  ConstructorCalls();
        this();

    }

    public static void method1(){
        // method2();
        //  ConstructorCalls();
    }

    public  void method2(){
        method1();
    }


}