package day47_Abstraction;

public class driverObjects {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

        System.out.println("=========================================");
        firFoxDriver driver2 = new firFoxDriver();
        driver2.get("https://www.google.com");
        driver2.quit();

        System.out.println("=========================================");
        operaDriver driver3 = new operaDriver();
        driver3.get("https://www.google.com");
        driver3.quit();

    }
}
