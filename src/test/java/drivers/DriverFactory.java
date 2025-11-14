package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void initializeDriver(String browser) {
        if (driver.get() == null) {
            if (browser.equalsIgnoreCase("Edge")) {
                /*
                On my local WebDriver Manager for some reason can`t connect to repository with Edge driver,
                so I get "java.net.UnknownHostException: msedgedriver.azureedge.net" exception
                to avoid this exception I downloaded and set WebDriver locally
                If you are facing same issue please download and set up WebDriver locally as well,
                and adjust WebDriver path in setProperty method below
                 */
//                System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
                WebDriverManager.edgedriver().setup();
                driver.set(new EdgeDriver());
            } else {
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
            }
        }
    }

    public static void tearDown() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
