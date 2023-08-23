package com.qascriptcucmber.PageObject;

import com.qascriptcucmber.Utils.BrowserUtil;

public class HomePage {

    private static String myAccountXpath = "//div[@id='content']/h2[1]";
    private static String allNotebooksAndLaptopXpath = "//a[text()='Show AllLaptops & Notebooks']";
    private static String laptopAndNotebooksXpath= "//a[text()='Laptops & Notebooks'][1]";


    public static void validateLogin(String expectedText){

        BrowserUtil.validateText(myAccountXpath,expectedText);

    }

    public static void clickOnAllNotebooksAndLaptop(){
        BrowserUtil.hoverAndClickElement(laptopAndNotebooksXpath,allNotebooksAndLaptopXpath);

    }
}


