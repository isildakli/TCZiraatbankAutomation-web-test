package operations;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DriverManager;

import java.util.List;

public class ScrollOperaion {

    private Logger log = Logger.getLogger(ClickOperation.class);
    private String logMessage = "";
    private WebDriver webDriver;
    private final DriverManager driverManager;
    private WaitOperation waitOperation;

    public ScrollOperaion(){

        driverManager = new DriverManager();
        webDriver = driverManager.getDriver();
        waitOperation = new WaitOperation();
    }

    public void scrollToElement(WebElement webElement) {

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        logMessage = String.format(" Scrolled to '%s' ", webElement);
        log.info(logMessage);

    }

    public void scrollToElementFromList(String locatorText, List<WebElement> elements) {

        for (WebElement element : elements) {
            if (element.getText().equals(locatorText)) {
                ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
                logMessage = String.format(" Scrolled to '%s' ", element);
                log.info(logMessage);
                break;
            }
        }

    }
}
