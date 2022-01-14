package operations;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.DriverManager;

import java.util.List;

public class ClickOperation {

    private Logger log = Logger.getLogger(ClickOperation.class);
    private String logMessage = "";
    private WebDriver webDriver;
    private final DriverManager driverManager;
    private WaitOperation waitOperation;

    public ClickOperation() {

        driverManager = new DriverManager();
        webDriver = driverManager.getDriver();
        waitOperation = new WaitOperation();
    }

    public void hover(WebElement element) {

        Actions action = new Actions(webDriver);
        action.moveToElement(element).build().perform();
        logMessage = String.format(" Hovered on '%s' ", element);
        log.info(logMessage);
    }

    public void hoverFromList(String locatorText, List<WebElement> elements) {

        for (WebElement element : elements) {
            if (element.getText().equals(locatorText)) {
                hover(element);
                logMessage = String.format(" Hovered on '%s' ", element);
                log.info(logMessage);
                break;
            }
        }
    }

    public void clickFromList(String locatorText, List<WebElement> elements) {

        for (WebElement element : elements) {
            if (element.getText().equals(locatorText)) {
                element.click();
                logMessage = String.format(" Clicked on '%s' ", element);
                log.info(logMessage);
                break;
            }
        }
    }

}
