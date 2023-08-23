package com.qascriptcucmber.PageObject;

import com.qascriptcucmber.Utils.BrowserUtil;

public class ProductPage {

    private static String linkMackbookXpath="//a[text()='MacBook']";
    private static String btnAddToCartXpath="//button[@id='button-review']";
    private static String txtProductHeadingXpath="//div[@id='product-product']/*//h1";
    private static String txtProductPriceXpath="//div[@id='product-product']/*//ul[@class='list-unstyled'][2]/li[1]/h2";
    private static String txtProductQuantityXpath="//input[@id = 'input-quantity']";
    private static String linkShoppingCartXpath="//span[text()='Shopping Cart']";

    public static void clickProduct()
    {
        BrowserUtil.clickBtnLink(linkMackbookXpath);
    }

    public static void validateProductPrice(String expectedValue){
        BrowserUtil.validateText(txtProductPriceXpath,expectedValue);
    }


    public static void validateProductName(String expectedValue){
        BrowserUtil.validateText(txtProductHeadingXpath,expectedValue);
    }

    public static void clickONAddToCartBtn()
    {
        BrowserUtil.clickBtnLink(btnAddToCartXpath);
    }

    public static void enterQuantity(String quantityValue){
        BrowserUtil.enterTextValue(txtProductQuantityXpath,quantityValue);
    }

    public static void clickShoppingCartLink() {
        BrowserUtil.clickBtnLink(linkShoppingCartXpath);
    }
}
