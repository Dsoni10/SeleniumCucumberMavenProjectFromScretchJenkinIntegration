package com.qascriptcucmber.Utils;

import com.qascriptcucmber.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Properties;

public class BrowserUtil extends BaseClass {

    public static Properties properties = PropertiesUtil.loadFrameworkProperties();

    public static void enterTextValue(String element,String text){
      findAndWaitWebElement(element).sendKeys(text);
    }
    public static void clickBtnLink(String element){
        findAndWaitWebElement(element).click();
    }
    public static WebElement findAndWaitWebElement(String element){
        String timeoutmax = properties.getProperty("timeout.max");
        WebElement element1 = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(timeoutmax));
            element1 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(element))));
        }
        catch(Exception e)
        {
            System.out.println("Element not found");
        }
        return  element1;
    }


    public static void validateText(String element, String expectedText) {
        String actualresult = findAndWaitWebElement(element).getText();
        Assert.assertEquals(actualresult,expectedText,"value of"+ actualresult + "match with" + expectedText);

    }

    public static void hoverAndClickElement(String elementHoverXpath,String elementClickXpath)
    {

        WebElement elementHover = findAndWaitWebElement(elementHoverXpath);
        WebElement elementClick = findAndWaitWebElement(elementClickXpath);
        Actions act = new Actions(driver);
        act.moveToElement(elementHover).click(elementClick).build().perform();
    }

    public static void validateValue(String element,String expectedValue,String attributeType){
        String actualeValue = findAndWaitWebElement(element).getAttribute(attributeType);
        Assert.assertTrue(actualeValue.equals(expectedValue),"Both value matched");
    }
}
