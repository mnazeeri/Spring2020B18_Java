package day45Exceptions;

public class ThrowsKeyword3 {
    public static void method1() throws Exception{

        Thread.sleep(3000);

    }

    public static void main(String[] args) {

       // method1(); //the caller is responsible to handle the exception unless "try&catch" is ued
    }
}
