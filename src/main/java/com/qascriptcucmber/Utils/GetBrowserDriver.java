package com.qascriptcucmber.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetBrowserDriver {

    public static WebDriver driver;
    public static WebDriver getBrowserDriver(String browser){

        if (browser!=null)
        {
            if(browser.equalsIgnoreCase("chrome"))
            {
                driver=setChromeDriver();
            }
            if(browser.equalsIgnoreCase("firefox"))
            {
                driver=setFirefoxDriver();
            }
            if(browser.equalsIgnoreCase("internetexplorer"))
            {
                driver=setIEDriver();
            }

        }
        return driver;
    }

    public static WebDriver setIEDriver() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }

    public static WebDriver setFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
}
