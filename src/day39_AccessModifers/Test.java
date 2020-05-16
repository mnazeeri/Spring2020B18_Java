package day39_AccessModifers;

public class Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers() ;
        System.out.println(obj.defaultAccess);
        System.out.println(obj.publicAccess);
       // System.out.println(obj.SSN); // it's not accessible due to being private
    }
}
