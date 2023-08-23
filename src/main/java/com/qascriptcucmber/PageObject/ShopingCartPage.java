package com.qascriptcucmber.PageObject;

import com.qascriptcucmber.Utils.BrowserUtil;

public class ShopingCartPage {

    private static String btnContinueShoppingXpath= "//a[text()='Continue Shopping']";
    private static String linkProductNameXpath="(//table[@class='table table-bordered'])[2]//tbody/tr/td[2]/a";
    //txtQuantityValue are present in value attribute
    private static String txtQuantityValueXpath="(//table[@class='table table-bordered'])[2]//tbody/tr/td[4]//input";
    private static String btnCheckoutXpath="//a[text()='Checkout']";


    public static void clickContinueShoppingBtn(){
        BrowserUtil.clickBtnLink(btnContinueShoppingXpath);
    }

    public static void clickCheckoutBtn(){
        BrowserUtil.clickBtnLink(btnCheckoutXpath);
    }

    public static void validateProductNameOnCartPage(String ProductName){
        BrowserUtil.validateText(linkProductNameXpath,ProductName);
    }

    public static void validateProductQuantityOnCartPage(String QunatityValue){

        BrowserUtil.validateValue(txtQuantityValueXpath,QunatityValue,"value");

    }
}
