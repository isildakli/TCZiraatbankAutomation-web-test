package steps;

import io.cucumber.java.en.And;
import locators.Locators;
import operations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DriverManager;

import java.util.List;

public class StepImplementations {


    private WebDriver webDriver;
    private final DriverManager driverManager;
    private ClickOperation clickOperation;
    private WaitOperation waitOperation;
    private ScrollOperaion scrollOperaion;
    private SendKeyOperation sendKeyOperation;
    private AssertionOperation assertionOperation;

    public StepImplementations() {

        clickOperation = new ClickOperation();
        driverManager = new DriverManager();
        webDriver = driverManager.getDriver();
        waitOperation = new WaitOperation();
        scrollOperaion = new ScrollOperaion();
        sendKeyOperation = new SendKeyOperation();
        assertionOperation = new AssertionOperation();
    }

    @And("Hover on {string} at {string}")
    public void hoverOnAtList(String arg0, String arg1) {

        By locatorOflist = Locators.getPageLocators().get(arg1);
        List<WebElement> elementsOfList = webDriver.findElements(locatorOflist);
        clickOperation.hoverFromList(arg0, elementsOfList);
    }

    @And("Wait {string} seconds")
    public void waitSeconds(String arg0) {

        int second = Integer.parseInt(arg0);
        WaitOperation.wait(second);
    }

    @And("Click {string} from {string}")
    public void clickFromList(String arg0, String arg1) {

        By locatorOflist = Locators.getPageLocators().get(arg1);
        List<WebElement> elementsOfList = webDriver.findElements(locatorOflist);
        clickOperation.clickFromList(arg0, elementsOfList);
    }

    @And("Scroll on {string} at {string}")
    public void scrollOnAt(String arg0, String arg1) {

        By locatorOflist = Locators.getPageLocators().get(arg1);
        List<WebElement> elementsOfList = webDriver.findElements(locatorOflist);
        scrollOperaion.scrollToElementFromList(arg0, elementsOfList);
    }

    @And("Scroll on {string}")
    public void scrollOn(String arg0) {

        By locator = Locators.getPageLocators().get(arg0);
        WebElement element = webDriver.findElement(locator);
        scrollOperaion.scrollToElement(element);
    }

    @And("Click on {string}")
    public void clickOn(String arg0) {

        By locator = Locators.getPageLocators().get(arg0);
        WebElement element = webDriver.findElement(locator);
        element.click();
    }

    @And("Send {string} to {string}")
    public void sendTo(String arg0, String arg1) {

        By locator = Locators.getPageLocators().get(arg1);
        WebElement element = webDriver.findElement(locator);
        sendKeyOperation.sendKey(arg0, element);
    }

    @And("Check {string} with {string}")
    public void checkWith(String arg0, String arg1) {

        By locator = Locators.getPageLocators().get(arg1);
        String textOfElement = webDriver.findElement(locator).getText();
        assertionOperation.checkEquals(arg0,textOfElement);
    }
}
