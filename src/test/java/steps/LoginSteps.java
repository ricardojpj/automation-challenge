package steps;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;

import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("I am on the Quotes to Scrape login page")
    public void login_page() {
        loginPage.navigateToLogin();
    }

    @When("I enter username {string} and password {string}")
    public void enter_credentials(String user, String pass) {
        loginPage.enterCredentials(user, pass);
    }

    @And("I click the login button")
    public void click_login() {
        loginPage.clickLogin();
    }

    @And("I should see the {string} option")
    public void logout(String linkText) {
        Assertions.assertTrue(loginPage.isLogoutDisplayed(), 
                              "Logout is not visible after successful login.");
    }
}