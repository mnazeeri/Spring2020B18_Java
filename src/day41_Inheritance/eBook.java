package day41_Inheritance;

public class eBook extends Book {

    /*
    Title (inherited)
    Author (inherited)
    Price (inherited)

    Size (declared)
    Pages (declared)
    Readbook() (declared)

    toString() (inherited)

     */

    public String size;
    public int pages;

    public void readbook(){
        System.out.println("reading "+title);
    }
}
