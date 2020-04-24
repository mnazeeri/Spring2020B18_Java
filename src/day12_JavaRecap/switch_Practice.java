package day12_JavaRecap;

public class switch_Practice {
    public static void main(String[] args) {

        switch (1){
            case 1:
                System.out.println("Case 1");
               // break; exits switch statement

            case 2:
                System.out.println("Case 2");
               // break; Logical error if there is no break statement

            default:
                System.out.println("Invalid Case ID!");
               // break;
        }
        System.out.println("==========================================================");
/*
200 - okay
201 - Created
202 - Accepted
301 - Moved Permanently
303 - other
404 - Not Found
 */
        int statuscode = 404;
        String result = "";

        switch (statuscode){
            case 200:
                System.out.println("OK");
                break;

            case 201:
                System.out.println("Created");
                break;

            case 202:
                System.out.println("Accepted");
                break;

            case 404:
                System.out.println("NOT FOUND");
                break;

            default:
                System.out.println("Invalid Status Code");


        }


    }
}
