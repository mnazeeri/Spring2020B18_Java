package day39_AccessModifers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);
        System.out.println("Grade: "+PersonalInfo.grade); //Since it's private grade does not compile
        // System.out.println("SSN: "+PersonalInfo.SSN); //Since it's private SSN does not compile
        // System.out.println("ID: "+PersonalInfo.ID); //Since it's private ID does not compile
        System.out.println("Age: "+PersonalInfo.age); //Since it's private age does not compile

    }
}
