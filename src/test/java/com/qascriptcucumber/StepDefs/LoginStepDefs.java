package com.qascriptcucumber.StepDefs;

import com.qascriptcucmber.PageObject.HomePage;
import com.qascriptcucmber.PageObject.LoginPage;
import com.qascriptcucmber.Utils.ExcelReader;
import com.qascriptcucmber.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class LoginStepDefs {

    Properties properties = PropertiesUtil.loadUserProperties();

    @Given("user enters valid username in the username field")
    public void userEntersValidUsernameInTheUsernameField() {
        String username = properties.getProperty("user");
        LoginPage.enterUsername(username);
    }

    @And("User enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        String password = properties.getProperty("password");
        LoginPage.enterPassword(password);
    }

    @When("User click on login button")
    public void userClickOnLoginButton() {
       LoginPage.clickLogin();
    }

    @Then("User is logged in sucessfully")
    public void userIsLoggedInSucessfully() {
        HomePage.validateLogin("My Account");
    }

    @Given("^user enters (.*) in the username field$")
    public void userEntersInvalidUsernameInTheUsernameField(String email) {
        LoginPage.enterUsername(email);
    }

    @And("^User enters (.*) in the password field$")
    public void userEntersInvalidPasswordInThePasswordField(String password) {
        LoginPage.enterPassword(password);
    }

    @Then("^error (.*) should be displayed$")
    public void errorMessageShouldBeDisplayed(String message) {
        LoginPage.validateInvalidLogin(message);
    }


    @Given ("User is Logged into the application")
    public void userIsLoggedIntoTheApplication() {
        userEntersValidUsernameInTheUsernameField();
        userEntersValidPasswordInThePasswordField();
        userClickOnLoginButton();
        userIsLoggedInSucessfully();

    }

    @Then ("^UserName and Password shows on console form given (.*)$")
    public void usernameAndPasswordShowsOnConsoleFormGivenRowsNumber(int rowNumber) throws IOException, InvalidFormatException {
        ExcelReader externalData = new ExcelReader();
        List<Map<String, String>> testData = externalData.getData("src/test/resources/testData/Login.xlsx", 0);
        System.out.println("UserName : " + testData.get(rowNumber).get("UserName") + " Password : " + testData.get(rowNumber).get("Password"));
    }
}
