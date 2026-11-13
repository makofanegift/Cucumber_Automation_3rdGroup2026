import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps {

    WebDriver driver;

    @Given("I am on hom page")
    public void i_am_on_hom_page() {
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--headless=new");
        driver = new ChromeDriver();


    }
    @And("I click login button")
    public void i_click_login_button() {

    }
    @And("I enter username (.*)$")
    public void i_enter_username(String username) {

    }
    @And("I enter password (.*)$")
    public void i_enter_password(String password) {

    }
    @When("I click submit button")
    public void i_click_submit_button() {

    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }

}
