package day48_Abstraction;

public class phoneObjects {

    public static void main(String[] args) {

          iPhone iphone1 = new iPhone("X", 1000, "10 inches");
          iPhone iphone2 = new iPhone("8", 900, "8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(123456789);
        iphone1.calling(911);
        iphone1.texting(789456123);

        System.out.println("==============================================");

         Samsung samsung1 = new Samsung("Note 10", 1200, "Plus");
        System.out.println(samsung1);

        samsung1.calling(13456);
       // samsung1.faceTiming(123456); this cannot be done
        samsung1.freezing();
        samsung1.texting(123456);
    }
}
