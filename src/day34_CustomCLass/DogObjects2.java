package day34_CustomCLass;

import java.lang.reflect.ParameterizedType;

public class DogObjects2 {
    public static void main(String[] args) {

        String food1 = "Chicken";
        String food2 = "Fish";
        String food3 = "mice";

        String drink1 = "milk";
        String drink2 = "coffer";
        String drink3 = "water";

        String toy1 = "PS4";
        String toy2 = "Piano";
        String toy3 = "Chess";

        String subject1 = "art";
        String subject2 = "Java";

        Dog dog1 = new Dog ();
        dog1.setDogInfo("Pomeranian", "Small", 3, "White", "Lily");

        Dog dog2 = new Dog ();
        dog2.setDogInfo("pomeranian", "Small",4, "White", "Ernie");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", "Miniature", 2, "White", "Lucy");

        dog2.eating(food1);
        dog1.eating(food2);
        dog3.eating(food3);
        System.out.println("_________________________");

        dog2.drinking(drink1);
        dog1.drinking(drink2);
        dog3.drinking(drink3);
        System.out.println("_________________________");

        dog1.playing(toy1);
        dog2.playing(toy2);
        dog3.playing(toy3);

        dog1.studying("art");
        dog3.studying("Java");
        dog2.studying("art");




        Dog dog4 = new Dog();
        dog2.setDogInfo("Alabay", "Extra Large", 5, "Black", "Ajdar");

        System.out.println("_____________________________________________________________________");

        Dog [] dogPark = {dog1, dog2, dog3, dog4};

        for (int i = 0; i< dogPark.length; i++){
            dogPark[i].eating("Chicken");
        }

        for(Dog each: dogPark){

            each.drinking("milk");
        }

        for( int i = 0; i<dogPark.length; i++){
            dogPark[i].playing("Chess");

        }

        for (Dog each:dogPark){
            each.studying(subject1);
        }



    }
}
