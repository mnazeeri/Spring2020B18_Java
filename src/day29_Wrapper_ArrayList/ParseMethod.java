package day29_Wrapper_ArrayList;

public class ParseMethod {
    public static void main(String[] args) {
        String str = "123";
        int a1 = Integer.parseInt(str); //123

        //System.out.println(str+1); //text
                        //  123 +1 ==> 1231
        //System.out.println(a1+1); // number
                        //  123+1 ==> 124
       byte b1 =  Byte.parseByte(str);
        System.out.println(a1 + 10);

        Integer I1 = (int) Byte.parseByte(str); //AutoBoxing

        // Integer = (int)byte;
        // Integer = int;

        String str2 = "10.5";

        float f1 = Float.parseFloat( str2 ); // Float 10.5
        System.out.println( f1 );

        double f2 = Double.parseDouble(str2); //Double 10.5
        System.out.println(f2 + 1);

        String str3 = "3147483647";
        long num1 = Long.parseLong(str3); //3147483647 (Primitive to primitive)
        System.out.println(num1+1);

        Long num2 = Long.parseLong(str3); // autoBoxing
        System.out.println(num2+2);

        String result = "true"; //the defualt value of boolean is false
        boolean a = true;
        boolean r1 = Boolean.parseBoolean(result); //boolean
        System.out.println(!r1);

        String result2 = "fAlSe"; //"false" it ignores case sensitivity
        boolean r2 = Boolean.parseBoolean(result2);
        System.out.println(r2);

    }
}
