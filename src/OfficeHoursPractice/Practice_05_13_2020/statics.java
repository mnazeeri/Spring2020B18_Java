package OfficeHoursPractice.Practice_05_13_2020;

public class statics {

    int instanceVariable = 100;
    static int staticVariable = 200;

    public static void  staticMethod(){
        //instanceMethod();  //cannot be called
       // System.out.println(instanceVariable);  //cannot be called
        System.out.println(staticVariable);

    }

    public void instanceMthod(){
        staticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);
    }

    public static void main(String[] args) {
      //  System.out.println(instanceVariable); //cannot be called
        System.out.println(staticVariable);
        staticMethod();
     //   instncemethod(); //cannot be called
    }
}
