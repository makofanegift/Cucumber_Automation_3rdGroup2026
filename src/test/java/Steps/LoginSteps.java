package Steps;

import Pages.HomePage;
import com.github.javafaker.Faker;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;


public class LoginSteps extends Base {

    @Given("I am on home page")
    public void i_am_on_home_page() {
        homePage.verifyHomePageIsDisplayed();

    }
    @And("I click login button")
    public void i_click_login_button() {
        homePage.clickLoginButton();

    }
    @And("I enter username (.*)$")
    public void i_enter_username(String username) {

        loginPage.enterUsername(username);
    }
    @And("I enter password (.*)$")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);

    }
    @When("I click submit button")
    public void i_click_submit_button() {
        loginPage.clickLoginSubmitButton();

    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        dashboardPage.verifyUserLoggedInSuccessfully();
    }

//    @Then("I should get an error message")
//    public void iShouldGetAnErrorMessage() {
//
//    }
}
