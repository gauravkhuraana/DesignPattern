package Creational.FactoryMethod.DriverFactory;

import org.openqa.selenium.WebDriver;

public class UsePattern {


    public static void main(String[] args)
    {
        WebDriver drv;
        drv=DriverFactory.getDriver("firefox");
        drv.get("https://www.google.com");
        drv.quit();
    }
}
