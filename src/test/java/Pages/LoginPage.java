package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login-email")
    WebElement usernameLocatorById;

    @FindBy(id = "login-password")
    WebElement passwordLocatorById;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButtonById;

    @FindBy(xpath = "//span[text()='Welcome']")
    WebElement verifySuccessfulLoginXpath;


    public LoginPage (WebDriver driver){
        this.driver = driver;

    }

    public void enterUsername(String username){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(usernameLocatorById));
        usernameLocatorById.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordLocatorById.sendKeys(password);
    }

    public void clickLoginSubmitButton(){
        loginSubmitButtonById.click();
    }

}
