package day33_CustomClass;
/*
Cat Class:
datat/attributes: instance variables
breed, color, age
actions: instance methods
sleep(), eat(), drink()

 */
public class Cat {

    String breed;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat(String catFood){
        System.out.println(name+" is eating");
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+ drink);
    }
    public void setCatInfo(String catBreed, String catColor, int catAge, String catName){
        breed = catBreed;
        color = catColor;
        age = catAge;
        name = catName;

    }
    public String toString(){
        return name+", breed is "+breed+", color is "+" "+age+" years old";
    }
}
