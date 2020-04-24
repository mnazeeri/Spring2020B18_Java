package day19_Arrays;

public class arraysPracticeOne {
    public static void main(String[] args) {

        /*
        My friends:

         */
        String [] friends = {"Messi", "Suarez", "Iniesta", "Griezman", "Stegen"};
                          //   0         1          2          3           4
        //System.out.println(friends[0]);
        //String s1 = friends [4];
        //System.out.println(s1);

        for (int i = 0; i <=4; i++){
            String name = friends[i];
            System.out.println(name);
        }
        System.out.println("=========================================================");

            String [] cars = {"infiniti", "porche", "Honda", "lamborgheni", "Dodge"};
                        //       0           1         2         3              4
        for (int i = 0; i <=4; i++){
            String name = cars[i];
            System.out.println(name);
        }

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        // print out all the users who regsitered with thier gmail

        //  max:  4

        for (int i = 0; i <= 3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }

        }


    }
}
