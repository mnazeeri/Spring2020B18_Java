package OfficeHoursPractice.Practice_04_01_2020;

public class literal_New {
    public static void main(String[] args) {
        String s1= "Java"; //string literal
        String s2= "Java"; //string literal

        String s3= new String("java");
        String s4= new String("Java");

        System.out.println(s1==s2); //true, same objects

        System.out.println(s1==s3); //false, different object at different memory

        System.out.println(s4 == s3); //false, different objects




    }
}
