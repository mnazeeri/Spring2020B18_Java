package day09_NesterdIf_Ternary;

public class ageGroup_NestedIf {

    /*
    Write a program that can define the age groups of the person age gourps are:
    Teenager: (> 21)
    Adult: (>=21 && <55)
    Senior: (>55)
    Note: Age cannot be negative or more than 150yrs old.
     */
    public static void main(String[] args) {

        int age = 27;
        String ageGroup = "";

        if (age < 150 && age>0){
            if (age < 21){
                ageGroup = "Teenager";
            }else if (age < 55){
                ageGroup = "Adult";
            }else {
                ageGroup = "Senior";
            }
        }else {
            ageGroup = "Invalid Entry";

        }
        System.out.println(ageGroup);

        System.out.println("============================================================================");

        int age2 = 45;
        String ageGroup2 = "";

        if (age < 150 && age > 0){

            ageGroup2 = (age2 < 21) ? "Teenager" :(age2< 55) ? "Adult" : "Senior";

        }else {
            ageGroup2 = "Invalid Entry";
        }

        System.out.println(ageGroup2);

    }
}
