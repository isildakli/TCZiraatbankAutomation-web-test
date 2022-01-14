package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.DriverManager;


public class BaseStep {

    private WebDriver webDriver;
    private final DriverManager driverManager;

    final static String baseURL = "https://www.ziraatbank.com.tr/tr";

    public BaseStep() {

        driverManager = new DriverManager();
    }

    @Before
    public void StartTest() {
        driverManager.setUpDriver();
        webDriver = driverManager.getDriver();
    }

    @Given("Go to adress")
    public void goToAdress() {
        webDriver.get(baseURL);
    }

    @After
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }


}
