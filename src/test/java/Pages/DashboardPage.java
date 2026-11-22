package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Welcome']")
    WebElement verifySuccessfulLoginXpath;


    public DashboardPage(WebDriver driver){
        this.driver = driver;

    }

    public void verifyUserLoggedInSuccessfully(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(verifySuccessfulLoginXpath));
        verifySuccessfulLoginXpath.isDisplayed();
    }

}
