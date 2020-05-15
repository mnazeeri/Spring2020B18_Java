package OfficeHoursPractice.Practice_05_13_2020;

public class staticBlock {

    static String str;


    static{

        str = "Cybertek";
        str = "Harvard";
        str = "MIT"; // this will be printed because this is the final initialization
    }



    public static void main(String[] args) {

        str = "Cybertek";
        System.out.println(str);
    }
}

class staticBlockTest{

    public static void main(String[] args) {

        System.out.println(staticBlock.str);
    }
}
