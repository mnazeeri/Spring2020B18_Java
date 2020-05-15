package day40_Encapsulation;

public class CredentialObjects {

    public static void main(String[] args) {
        Credentials NTZfacebook = new Credentials();

        NTZfacebook.setUserName("mnazeeri");
        NTZfacebook.setUserName("Dallas219");

        System.out.println(NTZfacebook.getUserName());
        System.out.println(NTZfacebook.getPassWord());


    }
}
