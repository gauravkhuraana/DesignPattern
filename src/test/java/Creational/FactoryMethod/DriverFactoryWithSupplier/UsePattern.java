package Creational.FactoryMethod.DriverFactoryWithSupplier;

import Creational.FactoryMethod.DriverFactory.DriverFactory;
import org.openqa.selenium.WebDriver;

public class UsePattern {


    public static void main(String[] args)
    {
        WebDriver drv;
        drv= DrvFactSupplier.getDriver(BrowserType.FIREFOX);
        drv.get("https://www.google.com");
        drv.quit();
    }
}
