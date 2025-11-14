package pages;

import drivers.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private static final Logger log = LogManager.getLogger(LoginPage.class);
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final String URL = "https://www.saucedemo.com/";

    public LoginPage(WebDriver driver) {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }


    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorMessage;

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement titleLabel;


    public void openPage() {
        log.info("User opens the Login Page");
        driver.get(URL);
    }

    public void enterUsername(String username) {
        log.info("User sets username '{}'", username);
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        log.info("User sets password '{}'", password);
        passwordField.sendKeys(password);
    }

    public void clearUsername() {
        log.info("User clears username on Login form");
        usernameField.sendKeys(Keys.CONTROL, "a");
        usernameField.sendKeys(Keys.DELETE);
    }

    public void clearPassword() {
        log.info("User clears password on Login form");
        passwordField.sendKeys(Keys.CONTROL, "a");
        passwordField.sendKeys(Keys.DELETE);
    }

    public void clickLoginBtn() {
        log.info("User clicks on login button");
        loginBtn.click();
    }

    public String getErrorMessage() {
        String errorMessageText = wait.until(ExpectedConditions.visibilityOf(errorMessage))
                .getText();
        log.info("User get error message: '{}'", errorMessageText);
        return errorMessageText;
    }
}