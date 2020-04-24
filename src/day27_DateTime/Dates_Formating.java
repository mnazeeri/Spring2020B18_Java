package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates_Formating {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Apr/23/20
         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEE MMM/dd/yyyy");
        LocalDate date2 = LocalDate.of(1989, 11, 29);
        String str1 = date2.format(dtf1);
        System.out.println(str1);

        LocalDate date3 =LocalDate.now();

        System.out.println( date3.format(dtf1) );


    }
}
