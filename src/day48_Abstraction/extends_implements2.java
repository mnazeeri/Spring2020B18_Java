package day48_Abstraction;


interface P{
    void metho1();
}

interface Q{
    int method2();
}

abstract class R{
    abstract void method3();
}

public class extends_implements2 extends R implements Q, P{

    public static void main(String[] args) {

     //   R obj = new R(); // not concrete
    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }

    @Override
    public void metho1() {

    }
}
