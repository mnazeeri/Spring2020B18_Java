package day42_Inheritance;

class A{

    int a  = 100;

    public A(double b){

        System.out.println(this.a); // 100


    }
}





public class SuperKeyWord extends A{

    int a = 100;

   public SuperKeyWord(){

       super((3.0)); //100
       System.out.println(super.a); // 100


    }

    public static void main(String[] args) {
            SuperKeyWord obj = new SuperKeyWord();
    }
}
