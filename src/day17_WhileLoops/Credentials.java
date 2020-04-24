package day17_WhileLoops;

/*
user: Murtaza
pass: Nazeeri12345
 */

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter username: ");
        String username = input.next();

        System.out.println("enter password: ");
        String password = input.next();

        int count = 1;
        boolean valid = (username.equals("Murtaza") && password.equals("Nazeeri12345"));
        // validating the first user and pass

        while (!valid){ // we od this part only if the user enters the wrong credentials
            System.out.println("Please re-enter your credentials: ");
            System.out.println("Enter user name: ");
            username = input.next();

            System.out.println("Enter Password: ");
            password = input.next();

            valid = (username.equals("Murtaza") && password.equals("Nazeeri12345"));
            //validating the new user and pass

            count++;
            if (count ==3 && !valid){
                System.out.println("Your account is locked!");
                break;
            }

        }
        if (valid) {
            System.out.println("Logged in Successfully!");
        }

    }
}
