package day05_UnaryshothandOperators;

public class LeapYear {

    /* 1. Create a class called LeapYear, and write a program that can identify if the given is leap year, print if it's leap year
    ex:
    Year = 2020 ==> short
    Leapyear == true/false;

    output:
    2020 is a leap year; True
     */
    public static void main(String[] args) {

      short year = 2025;
      //leapyear: year % 4 == 0
        //if return true ==> leapyear, if it returns false ==> bit leapyear
        boolean leapYear = year % 4 == 0; // if the year cab devided by 4 without any remainder, then it's leap year.
        String result = (year + " is year: " + leapYear);
        System.out.println(result);


    }




}
