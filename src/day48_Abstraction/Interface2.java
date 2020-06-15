package day48_Abstraction;

public interface Interface2 {

   //public Interface2(){ } // we cannot have constructors, instance variables, instance blocks, static blocks and instance methods in Interface,

  //  public void method1() {}

    // { }


   int a = 100;



    public static void main(String[] args) {

        System.out.println(Interface2.a); // by default static
        Interface2.method4();

       // a = 200; // a by default is final

    }

    public static void  method4(){  }

    void method5();

    public default void method6(){
        System.out.println("Default Method");
    }

}
