package Utils;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.util.Locale;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url){

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");

        switch (browserChoice.toLowerCase(Locale.ROOT)){
            case "chrome":
                driver = new ChromeDriver(options);
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "internet explorer":
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new SafariDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }

    @Test
    public void test(){
        startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    }

}
