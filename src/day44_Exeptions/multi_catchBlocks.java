package day44_Exeptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {

        try {
            System.out.println(100/0);

        }catch (ClassCastException e){
            System.out.println("Class Cast");

        }catch (NoSuchElementException e){
            System.out.printf("No such element");

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bond");

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }
    }
}
