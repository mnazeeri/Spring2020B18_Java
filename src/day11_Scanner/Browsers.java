package day11_Scanner;
/*
Write a program that can display the selected browser:
 */
public class Browsers {
    public static void main(String[] args) {

        String browserName = "opera";

        switch (browserName){
            case "chrome":
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;

            case "Firefox":
                System.out.println("Firefox is opening...");
                break;
            case "Safari":
                System.out.println("Safari is opening...");
                break;

            case "opera":
                break;
            case "Opera":
                System.out.println("Opera is opening...");
                break;
            default:
                System.out.println("Invalid Browser Name, Please double check...");
        }


    }
}
