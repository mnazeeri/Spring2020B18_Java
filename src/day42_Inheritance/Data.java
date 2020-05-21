package day42_Inheritance;

public class Data {

    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private String privateData = "private";

}

class  testing extends Data{

    /*
    piblic, default, protected
     */

    public static void main(String[] args) {

        System.out.println(testing.defaultData);    // always visible and can be inherited
        System.out.println(testing.protectedData); // always visible and can be inherited
        System.out.println(testing.publicData);
      //System.out.println(testing.privateData); //private cannot be inherited to any sub class.
    }
}
