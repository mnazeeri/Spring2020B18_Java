package day07_IfStatements;

public class VoteExample {
    public static void main(String[] args) {
        int age = 18;
        boolean citizen = true;
        boolean likeDonald =true;
        boolean eligible = age >= 18 && citizen;

        if (eligible == true) {
                    System.out.println("you are eligible to vote");
                }
        if (eligible == !true) {
            System.out.println("you are not eligible to vote");
        }







    }
}
