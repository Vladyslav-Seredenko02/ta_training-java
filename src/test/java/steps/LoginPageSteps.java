package steps;

import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


    @Given("User opens the Login Page")
    public void userOpensTheLoginPage() {
        loginPage.openPage();
    }

    @When("User set {string} username and {string} password on Login Page")
    public void userSetUserNameAndPasswordOnLoginPage(String name, String password) {
        loginPage.enterUsername(name);
        loginPage.enterPassword(password);
    }


    /*
    UC-1
     */
    @And("User clears username and password fields")
    public void userClearsUsernameAndPasswordFields() {
        loginPage.clearUsername();
        loginPage.clearPassword();
    }

    /*
    UC-2
     */
    @And("User clears password field")
    public void userClearsPasswordField() {
        loginPage.clearPassword();
    }

    @And("User clicks Login button")
    public void userClicksLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("Error message {string} is displayed")
    public void errorMessageIsDisplayed(String expected) {
        assertThat("loginPage error don`t contain expected message",
                loginPage.getErrorMessage(), containsString(expected));
    }
}