package com.qascriptcucmber;

import com.qascriptcucmber.Utils.PropertiesUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

import static com.qascriptcucmber.Utils.GetBrowserDriver.getBrowserDriver;

public class BaseClass {

    public static WebDriver driver;
    public static Properties properties = PropertiesUtil.loadApplicationProperties();
    public static Properties props = PropertiesUtil.loadFrameworkProperties();
    public static void initilizeDriver(){


        String browser = props.getProperty("browser.driver").toString();
        String url = properties.getProperty("application.url").toString();
        driver = getBrowserDriver(browser);
        driver.get(url);
        driver.manage().window().maximize();

    }

    public static void closeDriver(){
        driver.quit();
    }
}






