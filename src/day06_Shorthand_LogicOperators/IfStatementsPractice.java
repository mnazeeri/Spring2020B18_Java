package day06_Shorthand_LogicOperators;

public class IfStatementsPractice {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        if (a > b) { //false statement
            System.out.println(a+ " is greater than" +b);
        }
         if (b>a);
        System.out.println(b+ " is greater " + a);

        if (a == b) {
         System.out.println(a +" is equal to " + b);
    }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      int x = 300;
      int y = 300;
      boolean xGreater = x > y;
      boolean ygreater = y > x;

      if (xGreater) {
          System.out.println(x+ " is greater than " + y);

      }
      if (ygreater) {
          System.out.println(y+" is greater than " +x);
      }

      if (xGreater == false && ygreater == false) {
          System.out.println(x+" is equal to " + y);
      }
      if (!xGreater && !ygreater);
        {
            System.out.println(x + " is equal to " + y);
        }
        if (!xGreater == !ygreater);
        System.out.println(x+" is equal to " + y);
    }
}
