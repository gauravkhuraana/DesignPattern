package Creational.FactoryMethod.DriverFactoryWithSupplier;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DrvFactSupplier {

   private DrvFactSupplier(){}

   private static final Supplier<WebDriver> CHROME
           = ()->{
       WebDriverManager.chromedriver().setup();
       return new ChromeDriver();
   };

   private static final Supplier<WebDriver> FIREFOX = ()->{
       WebDriverManager.firefoxdriver().setup();
       return new FirefoxDriver();
    };

   private static final Map<BrowserType,Supplier<WebDriver>> Map = new EnumMap<>(BrowserType.class);

   static
   {
       Map.put(BrowserType.CHROME,CHROME);
       Map.put(BrowserType.FIREFOX,FIREFOX);
   }

   public static WebDriver getDriver(BrowserType browser)
   {
       return Map.get(browser).get();
   }
}
