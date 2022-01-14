package locators;

import org.openqa.selenium.By;

import java.util.HashMap;

public class Locators {

    private static HashMap<String, By> PageLocators;

    public static HashMap<String, By> getPageLocators() {

        if (PageLocators == null)
            PageLocators = new HashMap<String, By>();

        if (PageLocators.size() <= 0)
            initPageLocators();

        return PageLocators;
    }

    private static void addId(String key, By value) {
        PageLocators.put(key, value);
    }

    private static void initPageLocators() {

        /*ZiraatBank-WebSite-Needed-Locators*/
        addId("navigationBar",By.cssSelector("div#slider-container .navigation > ul > li"));
        addId("subListNavigationBar",By.cssSelector(".header .navigation > ul > li:nth-of-type(1) > .sub-navigation-container  .row > div > ul > li > a"));
        addId("divTitlesOfCreditPage",By.cssSelector("div#landingNav > div > div  h2 > span"));
        addId("subListsOFTitles",By.cssSelector("div#landingNav > div > div  .row > div >ul > li"));
        addId("calculatorTitle",By.cssSelector(".mT30.sub-page-form > h2"));
        addId("dropDownListOfTheCreditType",By.cssSelector("span[role='presentation'] > b[role='presentation']"));
        addId("dropDownList",By.cssSelector("#select2-ddlCredit-results > li"));
        addId("amountTextBox",By.cssSelector("input#calc-tutar"));
        addId("expiryTextBox",By.cssSelector("input#calc-vade"));
        addId("interestTextBox",By.cssSelector("input#faiz-orani"));
        addId("calculateButton",By.cssSelector(".btn.btn-red.calculation-btn"));
        addId("titleOfCreditPages",By.xpath("//div[@id='s4-bodyContainer']/div[2]//h1[1]"));
        addId("installmentAmountText",By.cssSelector(".result-right > div:nth-of-type(1) > span"));
        addId("interestRateText",By.cssSelector(".result-right > div:nth-of-type(2) > span"));
        addId("annualCostRateText",By.cssSelector(".result-right > div:nth-of-type(3) > span"));
    }
}
