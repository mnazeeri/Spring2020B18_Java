package day37_Constructors;

class dog{

    String name; //only belongs to the objects of the dog class
    int age; //only belongs to the objects of the dog class


}

class Test{

    public static void main(String[] args) {
       // Test obj = new Test(); this will not compile due to not being from same class
        dog obj = new dog();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}

public class StaticReview {

    static int a; // 1 copy
    int b; // 2 copies because each object has its own copy of the instance variable

    static String name = "John";
    String ID = "123";

    public static void main(String[] args) {

        StaticReview obj1 = new StaticReview();
        obj1.a = 20;

        obj1.b = 10;

        StaticReview obj2 = new StaticReview();
        obj2.a = 30;

        obj2.b = 40;

        System.out.println(obj1.a); // it will give 30 in this case
        System.out.println(obj2.a); // still 30 because there is only one copy that shares by all the objects

        System.out.println(obj1.b); // it will give 10
        System.out.println(obj2.b); // this will not give 10 because these two object do not share the same copies ->40

        System.out.println("=========================================================================================");
        System.out.println(name);
        // System.out.println(ID); // we cannot call "ID" here because static only accept static

    }
}
