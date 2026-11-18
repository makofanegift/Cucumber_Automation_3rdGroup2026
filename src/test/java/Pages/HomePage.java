package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Login']")
    WebElement loginButtonByxpath;

    public HomePage (WebDriver driver){
        this.driver = driver;

    }
    public void verifyHomePageIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginButtonByxpath));
        loginButtonByxpath.isDisplayed();

    }
    public void clickLoginButton(){
        loginButtonByxpath.click();

    }


}
