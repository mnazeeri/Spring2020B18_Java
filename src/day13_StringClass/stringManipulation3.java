package day13_StringClass;

public class stringManipulation3 {
    public static void main(String[] args) {

        String str = "I like Java Programing";
        int num1 = str.indexOf("J");
        System.out.println(num1);

        String str2 = "Cybertek school is awsome";
        int firstS = str2.indexOf("s"); //9
        int secondS = str2.indexOf("is")+1; //17
        //+1 makes it possible to find the number of "s" after "i"
        System.out.println(firstS);
        System.out.println(secondS);

        int maxIndenumber = "Cybertek".length() -1; // 8-1
        System.out.println(maxIndenumber);

        String names = "Murtaza";
        int a1 = names.indexOf("Bad Guy");
        // if the words don't exist it return negative number
        System.out.println(a1);

        String fullname = "Luis Suarez";
        //any name can be placed and run by this program
        String firstName = fullname.substring(0,fullname.indexOf(" "));
        String lastName = fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstName);
        System.out.println(lastName);


    }
}
