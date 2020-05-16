package Resources;
import day39_AccessModifers.AccessModifiers;

import javax.net.ssl.SNIServerName;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        //System.out.println(obj.defaultAccess); //only access in the same package
        System.out.println(obj.publicAccess); // open to the public

       // System.out.println(obj.SSN); // private: can be accessd only in the same class




    }
}
