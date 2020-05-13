package day38_Constructors;

public class ConstructorCallas3 {

    public ConstructorCallas3(){
        this(9); //int argument
        System.out.println("default");
        //    this(9); //int argument
    }

    public ConstructorCallas3(int a){
        //  this();
        System.out.println("Int argument");

    }

    public ConstructorCallas3(String str){
        //this("Hello");
    }


    public static void main(String[] args) {

        new ConstructorCallas3();

    }




    public void method1(){
        // this();
        // method1();
    }


}