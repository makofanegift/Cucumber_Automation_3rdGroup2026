package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//span[text()='Login']")
    WebElement loginButton;

    public HomePage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }
    public void verifyHomePageIsDisplayed(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.isDisplayed();

    }
    public void clickLoginButton(){
        loginButton.click();

    }


}
