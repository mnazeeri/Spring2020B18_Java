package day44_Exeptions;

public class try_catchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Hello");

       try {


        Thread.sleep(2000);

           System.out.println("Try Block");

       }catch (Exception e){
           System.out.println("Catch Block");

           }

        System.out.println("World");
    }
}
