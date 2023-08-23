package com.qascriptcucumber.StepDefs;

import com.qascriptcucmber.PageObject.HomePage;
import com.qascriptcucmber.PageObject.ProductPage;
import com.qascriptcucmber.PageObject.ShopingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefs {
    @Given ("User click on Show All Notebooks and Laptop link on Homepage")
    public void userClickOnShowAllNotebooksAndLaptopLinkOnHomepage() {
        HomePage.clickOnAllNotebooksAndLaptop();

    }

    @When ("User click on Add to Cart button for Macbook product")
    public void userClickOnAddToCartButtonForMacbookProduct() {
        ProductPage.validateProductName("MacBook");
        ProductPage.validateProductPrice("$602.00");
        ProductPage.clickONAddToCartBtn();

    }

    @Then ("Macbook product is added into the shopping cart")
    public void macbookProductIsAddedIntoTheShoppingCart() {
        ShopingCartPage.validateProductNameOnCartPage("MacBook");
        ShopingCartPage.validateProductQuantityOnCartPage("1");

    }

    @And ("User click on Mackbook product")
    public void userClickOnMackbookProduct() {
        ProductPage.clickProduct();
    }

    @And ("User enter the quantity for product")
    public void userEnterTheQuantityForProduct() {
        ProductPage.enterQuantity("2");
    }

    @And ("User click on Shoping cart link")
    public void userClickOnShopingCartLink() {
        ProductPage.clickShoppingCartLink();
    }
}
