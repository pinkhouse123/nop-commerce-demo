package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;
    public void clickOnLoginLink(){
        Reporter.log("Clicking on login link" + loginLink.toString()+"<br>");
        clickOnElement(loginLink);
    }
    public void verifyLogInLink(){
        Reporter.log("Verify LogIn link"+ loginLink.toString()+"<br>");
        String actualText=getTextFromElement(loginLink);
        String expectedText="Log in";
        Assert.assertEquals(actualText,expectedText,"verify LogIn link Text");
    }

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;
    public void verifyLogOutText(){
        Reporter.log("Verifying Logout Text" + logOut.toString()+"<br>");
        String actualText=getTextFromElement(logOut);
        String expectedText="Log out";
        Assert.assertEquals(actualText,expectedText,"Verify LogOut Text");
    }
    public void clickOnLogOutButton(){
        Reporter.log("Clicking on logout button" + logOut.toString()+"<br>");
        clickOnElement(logOut);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    public void clickOnRegisterLink(){
        Reporter.log("Click on register link" + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersTab;
    public void clickOnComputerTab(){
        Reporter.log("Click on computer tab"+computersTab.toString()+"<br>");
        clickOnElement(computersTab);
    }

}