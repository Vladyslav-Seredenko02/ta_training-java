package pages;

import drivers.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private static final Logger log = LogManager.getLogger(MainPage.class);
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final String URL = "https://www.saucedemo.com/inventory.html";

    public MainPage(WebDriver driver) {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }


    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement titleLabel;


    public String getTitleText() {
        String titleText = wait.until(ExpectedConditions.visibilityOf(titleLabel))
                .getText();
        log.info("User see title text: '{}'", titleText);
        return titleText;
    }

    public boolean titleTextIsVisible() {
        log.info("User checking title text is visible");
        return wait.until(ExpectedConditions.visibilityOf(titleLabel))
                .isDisplayed();
    }
}
