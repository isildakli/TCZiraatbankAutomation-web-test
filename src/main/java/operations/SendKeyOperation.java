package operations;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DriverManager;

public class SendKeyOperation {

    private Logger log = Logger.getLogger(ClickOperation.class);
    private String logMessage = "";
    private WebDriver webDriver;
    private final DriverManager driverManager;


    public SendKeyOperation(){

        driverManager = new DriverManager();
        webDriver = driverManager.getDriver();
    }

    public void sendKey(String text, WebElement element){

        element.clear();
        element.sendKeys(text);
        logMessage = String.format(" Sent '%s' to '%s' ", text,element);
        log.info(logMessage);
    }
}
