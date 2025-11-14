package steps;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseSteps {

    private static final Logger log = LogManager.getLogger(BaseSteps.class);

    @Given("User choose {string} browser")
    public void userChooseBrowser(String browser) {
        log.info("User choose browser: '{}'", browser);
        DriverFactory.initializeDriver(browser);
    }

    @After
    public void closeBrowser() {
        DriverFactory.tearDown();
    }
}
