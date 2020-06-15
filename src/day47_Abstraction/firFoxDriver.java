package day47_Abstraction;

import com.sun.jndi.toolkit.url.Uri;

public final class firFoxDriver extends RemoteWebDriver{

    @Override
    public void get (String URL){
        System.out.println("Opening: "+ URL+" in FireFox browser");
    }

    @Override
    public void quit(){
        System.out.println("Closing Firefox browser");
    }
}
