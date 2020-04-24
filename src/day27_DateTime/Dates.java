package day27_DateTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2020, 10, 25);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(2000, 12, 25);
        System.out.println(birthday);

        //isAfter(Date2)

        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

        //isBefore(Date2)

        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        //isEqual(Date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        //isLeapYear ();
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("+++++++++++++++++++++++++++++");

        LocalDate now = LocalDate.now(); // 2020-04-23
        System.out.println("Today is: "+ now);

        String str = now.toString();
        System.out.println(str.replace("-", "/"));

    }
}
