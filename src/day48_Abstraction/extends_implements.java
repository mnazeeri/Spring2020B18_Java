package day48_Abstraction;

interface I1{
    void method1();

}

interface I2 extends  I1{ // 1 abstract
   void method2();

}

abstract class AC implements I2 {  // 2 abstracts method
    abstract void method3();

}

public abstract class extends_implements extends AC{   //3 abstract methods

    @Override
    public void method1(){

    } // 2 abstract methods left (cuz we overrode one of them) method 2 and method 3

}

class testRun extends extends_implements{

    @Override
    public void method2() {

    }

    @Override
    void method3() {

    }
}
