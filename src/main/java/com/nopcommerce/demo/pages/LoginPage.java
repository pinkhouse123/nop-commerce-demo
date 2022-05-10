package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='master-wrapper-content']/div/div/div/div/h1")
    WebElement title;
    public void verifyWelcomeText() {
        String actualLogInText = getTextFromElement(title);
        String expectedLogInText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualLogInText,expectedLogInText,"verify welcome text");
    }

    @FindBy(id = "Email")
    WebElement email;
    public void enterEmailId(String id){
        Reporter.log("Enter Email ID" + email.toString()+"<br>");
        sendTextToElement(email,id);
    }

    @FindBy(id = "Password")
    WebElement password;
    public void enterPassword(String pass){
        Reporter.log("Enter Password" + password.toString()+"<br>");
        sendTextToElement(password,pass);
    }

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement loginBtn;
    public void clickOnLoginButton(){
        Reporter.log("Clicking on login Button" + loginBtn.toString()+"<br>");
        clickOnElement(loginBtn);
    }

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    public void verifyErrorMessage(){
        Reporter.log("Verifying error message" + errorMessage.toString()+"<br>");
        String  actualMessage=getTextFromElement(errorMessage);
        String finalText=actualMessage.substring(0,64);
        String expectedMessage="Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals(finalText,expectedMessage,"verify login error message");
    }
}