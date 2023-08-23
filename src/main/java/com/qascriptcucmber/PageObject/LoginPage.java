package com.qascriptcucmber.PageObject;
import com.qascriptcucmber.BaseClass;
import com.qascriptcucmber.Utils.BrowserUtil;

public class LoginPage extends BaseClass {

    private static String txtEmail = "//input[@id='input-email']";
    private static String txtPassword = "//input[@id='input-password']";
    private static String btnLogin = "//input[@value='Login']";
    private static String errorMessagInvalidLogin = "//input[@value='Login']";


    public static  void enterUsername(String username){
        BrowserUtil.enterTextValue(txtEmail,username);
    }

    public static  void enterPassword(String password){
        BrowserUtil.enterTextValue(txtPassword,password);
    }

    public static  void clickLogin(){
        BrowserUtil.clickBtnLink(btnLogin);
    }

    public static void validateInvalidLogin(String message){
        BrowserUtil.validateText(errorMessagInvalidLogin,message);
    }
}
