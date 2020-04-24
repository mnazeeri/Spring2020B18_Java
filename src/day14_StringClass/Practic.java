package day14_StringClass;

public class Practic {
    public static void main(String[] args) {

        String gmail ="cybertekschool@gmail.com";
        String userInputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userInputGmail); // false
        if (result){
            System.out.println("Logged In");
        }

        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School");
        System.out.println(r1);

        System.out.println("======================================================");

        /*
        Valid password Must contain a special character such as (!,_,@,%,$ etc.)
        A password should not contain space!
         */

        String passWord = "m nasd12345";
        if (passWord.contains(" ")){
            System.out.println("password is not valid due to space");
        }else{
            System.out.println("Valid Password");

            System.out.println("=================================================");

        }
/*
        Every website has "www." a the beginning of the web address.
         */

        String webAddress = "www.amazon.on.com";
        if(webAddress.startsWith("www.")){
            //true
            System.out.println("Valid");
        }

        String s3 = "United States";
        System.out.println(s3.startsWith("U")); //ture

        String s4 = "Cybertek School"; //true
        System.out.println(s4.endsWith("l")); //ture
        System.out.println(s4.endsWith("s")); //false
        System.out.println("=============================================");

        /*
        every single gmail address ends with @gamil.com
         */
    String email = "CybtertekSchool@yahoo.com";
    if (email.endsWith("@gmail.com")){
        System.out.println("Valid gmail");
    }else {
        System.out.println("Invalid gmail");
    }

    /*
    Write a program that can validate f a web address is valid:
    valid web address:
    Must start with www.
    Must end with .com, or .edue, .net, .gov, .org
     */

    }
}
