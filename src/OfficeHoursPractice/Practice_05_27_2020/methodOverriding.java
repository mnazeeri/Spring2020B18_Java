package OfficeHoursPractice.Practice_05_27_2020;

public class methodOverriding {

    public void method1() {
        System.out.println("Super Class");
    }
}

class test extends methodOverriding{
//     sub               super


    @Override
    public void method1(){
        System.out.println("Sub Class");
    }

    public static void main(String[] args) {

        methodOverriding obj = new methodOverriding();
        obj.method1();

    }

}
