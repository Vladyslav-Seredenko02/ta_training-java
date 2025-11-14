package steps;

import drivers.DriverFactory;
import io.cucumber.java.en.Then;
import pages.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class MainPageSteps {

    MainPage mainPage = new MainPage(DriverFactory.getDriver());

    /*
  UC-3
   */
    @Then("Page title is displayed and contains text {string}")
    public void pageTitleIsDisplayedAndContainsText(String expectedTitle) {
        assertThat("Title 'Swag Labs' is`t present", mainPage.titleTextIsVisible());
        assertThat(mainPage.getTitleText(), containsString(expectedTitle));
    }
}