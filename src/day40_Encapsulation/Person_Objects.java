package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
        Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);
        //System.out.println(Zarina.SSN); cannot access because it's private

        Zarina.setSSN(123456);
        System.out.println("Zarina' SSN: "+Zarina.getSSN());

       // System.out.println(Zarina.ID); cannot direclty access private data

        Zarina.setID(7890);
        System.out.println("Zarina' ID: "+Zarina.getID());

    }

}
