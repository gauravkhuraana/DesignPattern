package Creational.FactoryMethod.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private DriverFactory(){}

        public static WebDriver getDriver(String browser)
        {
            WebDriver drv = null;
            if(browser.equalsIgnoreCase("chrome"))
            {
                WebDriverManager.chromedriver().setup();
                drv = new ChromeDriver();
            }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            drv = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            drv = new EdgeDriver();
        }
         return drv;

    }
}
