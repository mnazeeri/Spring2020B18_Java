package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {

    //What can be inherited under a different package
    /*
    publicVariable
    portectedVariable

    publicMethod()
    prtoectedMethod()

     */

    public static void main(String[] args) {


        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
      //System.out.println(Inheritance2.defualtVariable); // default is not visible in under a different package


        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
      //Inheritance2.defaultMethod(); // default is not visible in under a different package
    }
}
