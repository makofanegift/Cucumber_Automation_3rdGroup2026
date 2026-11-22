package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends BasePage{

    @FindBy(id = "login-email")
    WebElement usernameLocatorById;

    @FindBy(id = "login-password")
    WebElement passwordLocatorById;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButtonById;


    public LoginPage (WebDriver driver){
        super(driver);

    }

    public void enterUsername(String username){
        enterText(usernameLocatorById, username);
    }

    public void enterPassword(String password){
        enterText(passwordLocatorById, password);

    }

    public void clickLoginSubmitButton(){
        click(loginSubmitButtonById);
    }

}
