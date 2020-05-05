package day34_CustomCLass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void eating (String food){
        System.out.println(name+" is eating "+food);
    }
    public void drinking (String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public void playing(String toy){
        System.out.println(name+" is playing"+ toy);
    }
    public void studying (String subject){
        System.out.println(name+" is studying "+ subject);
    }

    public void setDogInfo(String Breed, String Size, int Age, String Color, String Name){
        this.breed = Breed;
        this.size = Size;
        this.age = Age;
        this.color = Color;
        this.name = Name;

        //"this" keyword is used for calling object instances (instance variables)


    }

    public String toString (){
        return "Dog Name: "+name+", breed: "+breed+", size: "+size+", color: "+color+", age: "+age;
    }
}
